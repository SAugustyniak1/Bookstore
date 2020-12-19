package com.company;

import java.util.Comparator;
import java.util.function.ToIntFunction;

public class Movie implements Product, Watch{
    protected String title;
    protected MovieGenre genre;     protected String director;
    protected long ID;
    protected int price;


    public Movie(String title, MovieGenre genre, long ID, int price) throws Exception{
        Exception e = new IllegalArgumentException("ID cant be negative");

        if( ID < 0) throw e;

        this.title = title;
        this.genre = genre;
        this.ID = ID;
        this.price = price;

    }
    public Movie(String title, MovieGenre genre, long ID, int price, String director) throws Exception{
        Exception e = new IllegalArgumentException();

        if( ID < 0) throw e;
        this.title = title;
        this.genre = genre;
        this.ID = ID;
        this.price = price;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public String getTitle() {
        return title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    @Override
    public void printDetails() {
            System.out.printf("Title: %20s\nAuthor: %20s\nPrice: %20d\nID: %20d\n", this.title, this.genre, this.price, this.ID);
    }

    @Override
    public int compareTo(Product o) {
        if( this.getID() == o.getID()){
            return 0;
        }else if(this.getID() > o.getID()){
            return 1;
        }else{
            return -1;
        }
    }


}
