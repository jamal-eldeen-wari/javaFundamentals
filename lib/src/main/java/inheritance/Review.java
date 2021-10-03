package inheritance;

public class Review {
private String body;
private String author;
private int  stars;

    public Review(String body, String author, int stars) {
//        Only stars from 0 to 5 including 0 and 5;
        if (stars>=0 && stars<=5){
            this.body = body;
            this.author = author;
            this.stars = stars;
        }

    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }



    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                '}';
    }
}
