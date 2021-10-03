package inheritance;

import java.util.ArrayList;

public class Restaurant implements Reviews, Dollar${
    private String name;
    private double stars;
    private int price;


    private ArrayList<Review> restaurantRate = new ArrayList<>();

    public ArrayList<Review> getRestaurantRate() {
        return restaurantRate;
    }

    public Restaurant(String name, int price,int stars) {
        this.name = name;
        this.price = price;
        this.stars = stars;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price=" + price +
                '}';
    }

    @Override
    public void addReview(Review review) {
        restaurantRate.add(review);
//        double addRev = 0;

//        for (Review r: restaurantRate){
//            addRev = addRev +r.getStars();
//        }
//        stars = addRev/restaurantRate.size();
        update();
    }
    public void update(){
        double count =0;
        for(int i = 0; i<getRestaurantRate().size(); i++){
            count += getRestaurantRate().get(i).getStars();
        }
        count = count /(getRestaurantRate().size());
        count =Math.round(count);
        this.stars =count;
    }

    @Override
    public String addDollar$() {
        if (price<0){
            return "0$";
        }else{
//      counts the amount of times we want to repeat the string.
            return "$".repeat(price);

        }

    }
}
