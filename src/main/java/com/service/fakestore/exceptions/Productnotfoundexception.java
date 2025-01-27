package com.service.fakestore.exceptions;

public class Productnotfoundexception extends Exception{
    long id;
    String message;
    public Productnotfoundexception(long id,String message) {
        super(message);
        this.id = id;
    }
}
