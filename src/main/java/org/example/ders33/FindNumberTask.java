package org.example.ders33;

import java.util.Scanner;

public class FindNumberTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5 eded daxil edin: ");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maksimum = findMax(numbers);
        double ortalama = findAverage(numbers);

        System.out.println("Ortalama: " + ortalama);
        System.out.println("Maksimum: " + maksimum);
    }

    public static int findMax(int[] ededler) {
        int max = ededler[0];
        for (int reqem : ededler) {
            if (reqem > max) {
                max = reqem;
            }
        }
        return max;
    }

    public static double findAverage(int[] reqemler) {
        int cem = 0;
        for (int reqem : reqemler) {
            cem += reqem;  // 3, 6, 3, 9, 2
        }
        return cem / reqemler.length;
    }
}

