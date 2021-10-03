package inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi");

        Restaurant restaurant = new Restaurant("Burger Restaurant",5, 3);

        Restaurant restaurant2 = new Restaurant("Pizza Restaurant",4, 5);
        Restaurant restaurant3 = new Restaurant("Chicken Restaurant",3, 3);

        restaurant.addReview(new Review("Good restaurent","Jamal",3));
        Review review1 = new Review("Very nice stuff", "Khair", 4);
        Review review2 = new Review("good Chicken", "Qusai", 4);
//        restaurant.addReview(new Review("good","msakjocndsa",4));
        restaurant2.addReview(review1);
        restaurant3.addReview(review2);


        System.out.println(restaurant);
        System.out.println(restaurant.getRestaurantRate());
        System.out.println("Price Category "+restaurant.addDollar$());
        System.out.println();
        System.out.println(restaurant2);
        System.out.println(restaurant2.getRestaurantRate());
        System.out.println("Price Category "+restaurant2.addDollar$());
        System.out.println();
        System.out.println(restaurant3);
        System.out.println(restaurant3.getRestaurantRate());
        System.out.println("Price Category "+restaurant3.addDollar$());



    }
}
