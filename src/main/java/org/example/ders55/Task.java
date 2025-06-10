package org.example.ders55;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter first number: ");
            double number1 = scanner.nextDouble();

            System.out.println("Enter second number: ");
            double number2 = scanner.nextDouble();

            System.out.println("Select operation (+, -, *, /");
            char operation = scanner.next().charAt(0);

            double result = 0;
            boolean validOperation = true;

            if(operation == '+') {
                result = number1 + number2;
            } else if(operation == '-') {
                result = number1 - number2;
            } else if(operation == '*') {
                result = number1 * number2;
            } else if(operation == '/') {
                if(number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Invalid operation");
                    validOperation = false;
                }

                if (validOperation){
                    System.out.println("Result is: " + result);
                }

                System.out.println("Do you want to continue? (yes/no): ");
                String choice = scanner.next();
                if(choice.equalsIgnoreCase("no")) break;
            }

            scanner.close();
        }
    }
}
