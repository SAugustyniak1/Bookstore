package com.company;

public class IncorrectProductIdException extends IllegalArgumentException{

    long incorrectNumber;

    public IncorrectProductIdException(long incorrectNumber, String name) {
        super("Incorrect ID number: " + incorrectNumber + " in book: " + name);
        this.incorrectNumber = incorrectNumber;
    }

}
