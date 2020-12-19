package com.company;

public class Book implements Product{

    protected String title;
    protected String author;
    protected long ID;
    protected int price;

    public Book(String title, String author, long ID, int price) {
        this.title = title;
        this.author = author;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public void printDetails() {

        System.out.printf("Title: %20s\nAuthor: %20s\nPrice: %20d\n", this.title, this.author, this.price);

    }

    @Override
    public String toString() {
        return String.format("Title: %20s\nAuthor: %20s\nPrice: %20d\n", this.title, this.author, this.price);
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
