/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void restaurantConstructor(){
        Restaurant verify = new Restaurant("McDonald's",3,5);
        String actualValue = "McDonald's";
        assertEquals(actualValue,verify.getName());
    }

    @Test void toStringTest(){
        Restaurant toStringRes = new Restaurant("McDonald's",3,5);
        assertEquals("Restaurant{name='McDonald's', stars=5.0, price=3}",String.valueOf(toStringRes));
    }

    @Test void addReviewTest(){
        Restaurant addReviewTesting = new Restaurant("McDonald's",3,5);
        Review reviewTest = new Review("Best Restaurants Ever","Jamal",5 );
        addReviewTesting.addReview(reviewTest);
        assertEquals(addReviewTesting.getRestaurantRate().size(),addReviewTesting.getRestaurantRate().size());
    }

    @Test void testReviewConstructor(){
        Review testRev = new Review("Best Restaurants Ever","Jamal",5);
        String actualValue = testRev.getAuthor();
        assertEquals(actualValue,testRev.getAuthor());
    }

    @Test void testToStringReview(){
        Review reviewTest = new Review("Best Restaurants Ever","Jamal",5);
        assertEquals("Review{body='Best Restaurants Ever', author='Jamal', stars=5}",String.valueOf(reviewTest));
    }

    @Test void testShopConstructor(){
        Shops shopsTest = new Shops("Target","Grocery store ", 4, 3);
        String actualValue = shopsTest.getName();
        assertEquals(actualValue,shopsTest.getName());
    }

    @Test void testShopToString(){
        Shops testShop = new Shops("Best Buy","Electronic shop",4,5);
        assertEquals("Shops{name='Best Buy', description='Electronic shop', price=4}",String.valueOf(testShop));
    }

    @Test void testTheaterConstructor(){
        Theater theater = new Theater("Nashvile Dinner Theater", 5);
        String actualValue = theater.getName();
        assertEquals(actualValue,theater.getName());
    }

    @Test void testToStringTheater(){
        Theater theater = new Theater("Nashvile Dinner Theater",5);
        assertEquals("Theater{name='Nashvile Dinner Theater', rating ='5.0'}",String.valueOf(theater));
    }

    @Test void testAddMovie(){
        Theater theater = new Theater("Nashvile Dinner Theater",5);
        theater.addMovie("Cobra Kai");
        theater.addMovie("Breaking Bad");
        theater.addMovie("Rambo");
        theater.addMovie("Bad Boys");
        int size  = theater.getMovieList().size();
        assertEquals(size,theater.getMovieList().size());
    }

    @Test void testRemoveMovie(){
        Theater theater = new Theater("Nashvile Dinner Theater",5);
        theater.addMovie("Cobra Kai");
        theater.addMovie("Breaking Bad");
        theater.addMovie("Rambo");
        theater.addMovie("Bad Boys");
//        Remove methods;
        theater.removeMovie("Rambo");

        int size = theater.getMovieList().size();
        assertEquals(size,theater.getMovieList().size());
    }

    @Test void testReviewForTheater(){
        Theater theater = new Theater("Nashvile Dinner Theater",5);
        theater.addReview(new Review("This is a very good theater","Jamal",4));
        int size = theater.getReviewsTheater().size();
        assertEquals(size,theater.getReviewsTheater().size());
    }

}
