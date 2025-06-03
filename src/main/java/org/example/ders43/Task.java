package org.example.ders43;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        try {
            int result = a/b;
            System.out.println("Result: " +result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot be divided by 0");
        }
    }
}
