package org.example.ders44;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        try{
            System.out.println("Enter the text (press enter to save null): ");
            input = scanner.nextLine();
            if (input.trim().isEmpty()) {
                input = null;
            }
            System.out.println("Your text: " +input.length());
        } catch (NullPointerException e) {
            System.out.println("You have not entered anything");
        } finally {
            System.out.println("The process is over");

        }
    }
}
