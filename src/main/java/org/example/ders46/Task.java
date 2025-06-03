package org.example.ders46;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("MERCEDES");
        cars.add("AUDI");
        cars.add("PORSCHE");
        cars.add("WOLKSWAGEN");
        cars.add("TOYOTA");
        cars.add("JETOUR");
        cars.add("LAND ROVER");

        System.out.println(cars);
        System.out.println(cars.get(0));
        System.out.println(cars.get(cars.size()-1));
        System.out.println(cars.size());

        cars.remove(3);
        System.out.println(cars);
        System.out.println(cars.size());
    }
}
