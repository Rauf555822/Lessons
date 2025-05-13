package org.example.ders19;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[]args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Alma");
        fruits.add("Armud");
        fruits.add("Banan");
        fruits.add("Heyva");
        fruits.add("Şaftalı");

        System.out.println(fruits);
        System.out.println(fruits.get(0));
        System.out.println(fruits.get (fruits.size()-1));
        System.out.println(fruits.size());

        fruits.remove(2);
        System.out.println(fruits);
        System.out.println(fruits.size());
    }
}
