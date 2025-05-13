package org.example.ders30;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> names1 = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            System.out.println("Adlar daxil edin");
            String names = scanner.nextLine();
            switch (names) {
                case "next":
                    names1.poll();
                    System.out.println(names1);
                    break;
                default:
                    names1.add(names);
                    System.out.println(names1);
            }

        }

    }
}
