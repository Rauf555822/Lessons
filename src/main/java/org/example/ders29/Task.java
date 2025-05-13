package org.example.ders29;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int[] number = new int[5];
        int sum = 0;
        for (int i=0; i<5; i++) {
            System.out.println("ədədi daxil edin");
            number[i] = scaner.nextInt();
            sum +=number[i];
        }
        System.out.println(sum);
    }
}


