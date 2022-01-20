package com.company;

public class Car {
    String make;
    String model;
    int year;
    double price;
    boolean sold;

    Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.sold = false;
    }

    public String toString() {
        return make + " / " + model + " / " + year + " / " + price;
    }




}
