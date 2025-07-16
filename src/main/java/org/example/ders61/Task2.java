package org.example.ders61;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an year: ");

        if (scanner.hasNextInt()) {
            int year = scanner.nextInt();

            if (year > 0) {
                boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
                System.out.println(year + "February in is " + (isLeap ? "29" : "28") + " days.");
            } else {
                System.out.println("Error: Year cannot be 0 or negative.");
            }
        } else {
            System.out.println("Error: Please enter a number.");
        }

        scanner.close();
    }
}
