package org.example.ders48;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number: "); // 3;12;17;8;5
            numbers[i] = scanner.nextInt();
        }

        int max = numbers [4]; // 5
        int min = numbers[3]; //8

        for (int num : numbers) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        System.out.println("Minimum number is: " +min);
        System.out.println("Maximum number is:  " +max);
    }
}
