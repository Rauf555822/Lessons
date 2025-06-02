package org.example.ders35;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int [] numbers = new int[7];

        System.out.println("Enter 7 numbers: ");

        for (int i = 0; i < 7; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maksimum = findMax (numbers);
        double ortalama = findAverage (numbers);

        System.out.println("Ortalama: " + ortalama);
        System.out.println("Maksimum: " + maksimum);
    }
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    public static double findAverage(int[] number) {
        int plural = 0;
        for (int numbers : number) {
            plural += numbers;
        }
        return plural/number.length;
    }
}

