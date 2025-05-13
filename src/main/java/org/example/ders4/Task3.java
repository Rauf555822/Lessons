package org.example.ders4;

import java.util.Scanner;

public class Task3 {

    public static class SimpleCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Birinci ədədi daxil edin");
                double num1 = scanner.nextDouble();

                System.out.print("İkinci ədədi daxil edin");
                double num2 = scanner.nextDouble();

                System.out.print("Əməliyyatı seçin (+,-,*,/");
                char operation = scanner.next().charAt(0);

                double result = 0;
                boolean validOperation = true;

                if (operation == '+') {
                    result = num1 + num2;
                } else if (operation == '-') {
                    result = num1 - num2;
                } else if (operation == '*') {
                    result = num1 * num2;
                } else if (operation == '/') {
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Xəta: 0-a bölmək olmaz!");
                        validOperation = false;
                    }
                } else {
                    System.out.println("Düzgün əməliyyatı seçin (+,-,*./");
                    validOperation = false;
                }

                if (validOperation) {
                    System.out.println("Nəticə: " + result);
                }

                System.out.print("Davam etmək istəyirsiniz? (bəli/xeyr): ");
                String choice = scanner.next();
                if (choice.equalsIgnoreCase("xeyr")) break;
            }

            scanner.close();
        }
    }
}
