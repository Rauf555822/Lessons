package org.example.ders56;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            numbers [i] = scanner.nextInt();
        }
        int maximum = findMax (numbers);
        double average = findAverage (numbers);

        System.out.println("The maximum number is: " + maximum);
        System.out.println("The average number is: " + average);
    }
    public static int findMax (int [] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (max > number) {
                max = number;
            }
        }
        return max;
    }
    public static double findAverage (int [] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
