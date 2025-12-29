package java8.FunctionalInterfaces.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        populate(list);
        Consumer<Movie> consumer = movie -> {
            System.out.println("Movie Name : "+movie.movieName);
            System.out.println("Actor : "+movie.actorName);
            System.out.println("Actress : "+movie.actressName);
            System.out.println("Rating : "+movie.rating);
            System.out.println("*************");
        };
        for(Movie movie : list){
            consumer.accept(movie);
        }
    }
    public static void populate(ArrayList<Movie> list){
        list.add(new Movie("ABCD","Varun Dhavan","Shradha Kapoor","7"));
        list.add(new Movie("Rockstar","Ranbir Kapoor","Nargis","8"));
        list.add(new Movie("Saiyara","Ahaan Pandey","Aneet Padda ","8"));
        list.add(new Movie("Thamma","Ayushman Khurana","Rashmika Mandana","6"));
        list.add(new Movie("Namastey London","Akshay Kumar","Katrina Kaif","9"));
    }
}
