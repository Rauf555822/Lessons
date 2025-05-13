package org.example.ders24;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Birinci ədədi daxil edin: ");
        int a = scaner.nextInt();

        System.out.println("İkinci ədədi daxil edin: ");
        int b = scaner.nextInt();

        try {
            int result = a / b;
            System.out.println("Nəticə: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0-a bölmək olmaz");
        }
    }
}
