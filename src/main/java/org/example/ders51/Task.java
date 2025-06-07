package org.example.ders51;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name: ");
            names.add(scanner.nextLine());
        }

        System.out.println("Enter the name you want to check: ");
        String checkName = scanner.nextLine();

        if (names.contains(checkName)) {
            System.out.println("The name is on the list");
        } else {
            System.out.println("Name not listed: ");
        }
    }
}
