package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // -------------------------------------------------------------------------------------------------------

        List<Product> products = new ArrayList<>();

        // -------------------------------------------MOVIES------------------------------------------------------

        List<Movie> movies = new ArrayList<>();

        try {
            Movie pulpfiction = new MovieWithDirector("Pulpfiction", MovieGenre.ACTION, 25, 2421, "Tarantino");
            Movie lotr = new Movie("Lord of the rings", MovieGenre.ACTION, 23, 23213);
            Movie startwars = new Movie("Star Wars", MovieGenre.ACTION, 26, 32132);

            movies.add(pulpfiction);
            movies.add(lotr);
            movies.add(startwars);
        }catch (Exception e) {
            e.printStackTrace();
        }

        // -------------------------------------------------------------------------------------------------------

        // -------------------------------------------BOOKS-------------------------------------------------------

        try {
            Book manTadeusz = new Book("Man Tadeusz", "Mickiewicz", -26, 421321);
            Book booklotr = new Book("Lord of the rings", "Tolkien", 25, 13231);
            Book bookthis = new Book("This", "King", 25, 643321);
            Book javabegginers = new Book("Java for beginners", "Gaddis", 25, 32117);
            Book aliceInWonderland = new ChildrensBook("Alice in Wonderland", "Lewis Carroll", 20, 321313, "from 6 years");

            products.add(booklotr);
        }catch (IncorrectProductIdException e){
            System.out.println(e.getMessage());
        }

        // -------------------------------------------------------------------------------------------------------




        products.addAll(movies);


        Collections.sort(products);

        for (Product p : products
             ) {
            p.printDetails();
        }


//        products.forEach(p-> p.printDetails());





    }
}
