package org.example.ders3;

import java.util.Scanner;

    class LeapYearChecker {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("İli daxil edin: ");

            if (scanner.hasNextInt()) {
                int year = scanner.nextInt();

                if (year > 0) {
                    boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                    System.out.println(year + "-ci ildə Fevral " + (isLeap ? "29" : "28") + " gündür.");
                } else {
                    System.out.println("Xəta: İl 0 və ya mənfi ola bilməz.");
                }
            } else {
                System.out.println("Xəta: Zəhmət olmasa düzgün bir ədəd daxil edin.");
            }

            scanner.close();
        }
    }

