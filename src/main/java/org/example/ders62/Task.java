package org.example.ders62;

import java.util.Scanner;

public class Task {

    public static class SimpleCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Please enter the first number: ");
                double firstNum = scanner.nextInt();

                System.out.println("Please enter the second number: ");
                double secondNum = scanner.nextInt();

                System.out.println("Select operation: ");
                char operation = scanner.next().charAt(0);

                double result = 0;
                boolean validOperation = true;

                if (operation == '+') {
                    result = firstNum + secondNum;
                } else if (operation == '-') {
                    result = firstNum - secondNum;
                } else if (operation == '*') {
                    result = firstNum * secondNum;
                } else if (operation == '/') {
                    if (secondNum != 0) {
                        result = firstNum / secondNum;
                    } else {
                        System.out.println("Error: You can't divide by 0!");
                        validOperation = false;
                    }
                } else {
                    System.out.println("Select correct operation (+, -, *, /");
                    validOperation = false;
                }
                if (validOperation) {
                    System.out.println("Result: " + result);
                }

                System.out.println("Do you want to continue (Y/N): ");
                String choice = scanner.next();
                if (choice.equalsIgnoreCase("N")) break;
            }

            scanner.close();
        }
    }
}
