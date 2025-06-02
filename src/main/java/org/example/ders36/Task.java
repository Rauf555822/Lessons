package org.example.ders36;

import java.util.Scanner;
import java.util.Stack;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String>stack = new Stack<>();

        System.out.println("Write the sentence word by word: ");

        while (true) {
            String word = scanner.next();
            if (word.equalsIgnoreCase("Bitir")) {
                break;
            }
            stack.push(word);
        }

        System.out.println("Result: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop() + " ");
        }
        scanner.close();
    }
}
