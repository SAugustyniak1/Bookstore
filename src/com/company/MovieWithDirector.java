package com.company;

public class MovieWithDirector extends Movie{

    private String director;

    public MovieWithDirector(String title, MovieGenre genre, int price, int id, String director) {
        super(title, genre, price, id);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.printf("Director: %20s\n",this.director);
    }
}
