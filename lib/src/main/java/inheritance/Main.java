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

        Shops shop1 = new Shops("Best Buy","Electronic shop",4,5);
        shop1.addReview(new Review("Very good shop with affordable prices", "Jamal",5));

        Theater theater = new Theater("Nashvile Dinner Theater", 5);
        theater.addMovie("Rambo");
        theater.addMovie("Black Men");
        theater.addMovie("The Grudge");
        theater.addMovie("Home Alone");
        theater.removeMovie("Black Men");

        theater.addReview(new Review("This theater is good","Jamal", 5));


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


        System.out.println(shop1);
        System.out.println(shop1.getShopsReview());
        System.out.println(shop1.addDollar$());

        System.out.println(theater);
        System.out.println(theater.getReviewsTheater());
        theater.revMovie(new Review("This movie is all about brute strength", "Mohammad",4),"Rambo");
        System.out.println(theater.getMovieList());




    }
}
