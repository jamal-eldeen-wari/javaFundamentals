package inheritance;

import java.util.ArrayList;

public class Theater implements Movies,Reviews {
    private String name;
    private double stars;
    private String movie;

    private ArrayList<String> movieList = new ArrayList<>();
    private ArrayList<Review> reviewsTheater = new ArrayList<>();


    public Theater(String name, double stars) {
        if (stars <= 5 && stars >= 0) {
            this.name = name;
            this.stars = stars;
        }

    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setReviewsTheater(ArrayList<Review> reviewsTheater) {
        this.reviewsTheater = reviewsTheater;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<String> getMovieList() {
        return movieList;
    }

    public void setMovieList(ArrayList<String> movieList) {
        this.movieList = movieList;
    }

    @Override
    public void addMovie(String movie) {
        movieList.add(movie);
    }

    @Override
    public void removeMovie(String movie) {
        movieList.remove(movie);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", rating ='" + stars + '\'' +
                '}';
    }

    public ArrayList<Review> getReviewsTheater() {
        return reviewsTheater;
    }

    public void revMovie(Review review, String movie ){
        if (movieList.contains(movie)){
            reviewsTheater.add(review);
            System.out.println("Your review will be taken into consideration enjoy: "+movie);
        }else{
            System.out.println("This movie is not being viewed in our theater");
        }
    }

    @Override
    public void addReview(Review review) {
        reviewsTheater.add(review);
        update();
    }

    @Override
    public void update() {
        double count = 0;
        for (int i = 0; i < getReviewsTheater().size(); i++) {
            count += getReviewsTheater().get(i).getStars();
        }
        count = count / (getReviewsTheater().size());
        count = Math.round(count);
        this.stars = count;

    }
}


