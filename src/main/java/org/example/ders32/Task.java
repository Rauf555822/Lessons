
package org.example.ders32;

import java.util.Scanner;
import java.util.Stack;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        System.out.println("Cümleni söz-söz yazın:");

        while (true) {  // sonsuz dovr - sonsuz tekrar et
            String word = scanner.next();
            if (word.equalsIgnoreCase("bitir")) {
                break;
            }
            stack.push(word);
        }

        System.out.println("Netice:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        scanner.close();

    }
}








