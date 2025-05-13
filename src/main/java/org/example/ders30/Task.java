package org.example.ders30;

import java.util.Scanner;
import java.util.Stack;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> word1 = new Stack<>();
        for (int i = 0; i < 100; i++) {
            System.out.println("Sözlər daxil edin");
            String word = scanner.nextLine();
            switch (word) {
                case "undo":
                    word1.pop();
                    System.out.println(word1);
                    break;
                default:
                    word1.push(word);
                    System.out.println(word1);
            }
        }
    }
}

