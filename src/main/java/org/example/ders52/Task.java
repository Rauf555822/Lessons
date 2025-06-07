package org.example.ders52;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");

        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        System.out.println(numbers);
        System.out.println("Number of unique numbers: " + numbers.size());
    }
}
