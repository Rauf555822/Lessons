package org.example.ders28;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task {
    public static void main(String[] args) {
        Set<Integer> number = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("5 ədəd daxil edin:");

        while (number.size() < 5) {
            System.out.println("Ədəd:");
            int ədəd = scanner.nextInt();
            number.add(ədəd);

        }
        int cəm = 0;
        for (int ədəd : number) { // number setində hər elementi ardıcıllıq olaraq int ədəd
             cəm += ədəd; // cəm = cəm + ədəd

        }
        double ortalama = (double) cəm / 5;
        int maksimum = ((TreeSet <Integer>) number).last();
        System.out.println("Ortalama budur " + ortalama);
        System.out.println("Maksimum" + maksimum);
    }
}
