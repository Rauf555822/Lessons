package org.example.ders60;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result;

        do {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            System.out.println("Grade: ");
            int grade = scanner.nextInt();
            scanner.nextLine();
            Student student = new Student(name, grade);
            String status = student.getStatus();

            switch (status) {
                case "Excellent":
                    System.out.println("You are excellent");
                    break;
                case "Good":
                    System.out.println("You are good");
                    break;
                case "enough":
                    System.out.println("You are enough");
                    break;
                case "not enough":
                    System.out.println("You are not enough");
            }
            System.out.println("Do you want to continue? (y/n)");
            result = scanner.nextLine();
        } while (result.equalsIgnoreCase("y"));
    }
}
