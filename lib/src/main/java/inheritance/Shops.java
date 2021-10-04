package inheritance;

import java.util.ArrayList;

public class Shops implements Dollar$,Reviews {
    private String name;
    private  String description;
    private int price;
    private double stars;
    private ArrayList<Review> shopsReview= new ArrayList<>();


    public Shops(String name, String description, int price, double stars) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stars = stars;
    }

    public ArrayList<Review> getShopsReview() {
        return shopsReview;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String addDollar$() {
        if (price<0){
            return "0 $";
        }else{
            return "$".repeat(price);
        }
    }

    @Override
    public String   toString() {
        return "Shops{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void addReview(Review review) {
        shopsReview.add(review);
        update();
    }

    @Override
    public void update() {

        double count =0;
        for(int i = 0; i<getShopsReview().size(); i++){
            count += getShopsReview().get(i).getStars();
        }
        count = count /(getShopsReview().size());
        count =Math.round(count);
        this.stars =count;

    }
}
