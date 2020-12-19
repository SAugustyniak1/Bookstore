package com.company;


public abstract interface Product extends Comparable<Product>{


    public abstract void printDetails();
    public abstract long getID();
    public abstract void setID(long ID);

    @Override
    int compareTo(Product o);
}
