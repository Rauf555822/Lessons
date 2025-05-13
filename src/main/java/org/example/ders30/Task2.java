package org.example.ders30;

import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> names1 = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ad daxil edin");
            String names = scanner.nextLine();
            names1.add(names.toUpperCase());
        }
        System.out.println(names1);
    }
}
