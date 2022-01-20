package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean loop = true;
        ArrayList<Car> cars = new ArrayList<Car>();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Will's car lot management system!");

        while (loop) {
            for (Car car : cars) {
                System.out.println(car.toString());
            }
            System.out.println(cars.size());
            System.out.println("[Add] car, [Delete] car, or [Filter] cars. [q] to quit.");
            String action = input.nextLine();
            if (action.equals("Add")) {
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
//            else if (action.equals("Delete")) {
//                System.out.println("What is the model of the car?");
//                String dmodel = input.nextLine();
//                for (int i = 0; i < cars.size(); i++) {
//                    Car car = cars.get(i);
//                    if (car.model == dmodel) {
//                        cars.remove(car);
//                    }
//                }
//            }
            else if (action.equals("q")) {
                ;
            }
        }



    }
}
