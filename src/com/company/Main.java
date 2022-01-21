package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        boolean loop = true;
        ArrayList<Car> cars = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Will's car lot management system!");

        while (loop) {
            for (Car car : cars) {
                System.out.println(car.toString());
            }

            System.out.println(cars.size());
            System.out.println("[Add] car or [Delete] car. [q] to quit.");
            String action = input.nextLine();
            input.nextLine();
            if (action.equalsIgnoreCase("Add")) {
                System.out.println("Make:");
                String make = input.nextLine();
                System.out.println("Model:");
                String model = input.nextLine();
                System.out.println("Year:");
                int year = input.nextInt();
                System.out.println("Price:");
                double price = input.nextDouble();
                Car newCar = new Car(make, model, year, price);
                cars.add(newCar);
            }
            else if (action.equalsIgnoreCase("Delete")) {
                System.out.println("What is the model of the car?");
                String dmodel = input.nextLine();
                for (int i = 0; i < cars.size(); i++) {
                    Car car = cars.get(i);
                    if (car.model.equals(dmodel)) {
                        cars.remove(car);
                    }
                }
            }
            else if (action.equalsIgnoreCase("q")) {
                loop = false;
            }
        }
    }
}
