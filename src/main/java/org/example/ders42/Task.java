package org.example.ders42;

import java.util.Scanner;

public class Task {
    public static class WeeklyActivity {
        public static void main(String[] args) {
            String[]days = {
                    "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            };

            String[] activities = {
                    "Reading a book", "Exercising", "Watching a movie", "Spending time with friends",
                    "Learning something new", "Going for a walk", "Relaxing"
            };

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the day of the week number (1-7): ");

            if (scanner.hasNextInt()) {
                int dayNumber = scanner.nextInt();

                if (dayNumber >= 1 && dayNumber <= 7) {
                    System.out.println(days[dayNumber - 1] + " - " + activities[dayNumber - 1]);
                } else {
                    System.out.println("Error: Enter a number from 1 to 7.");
                }
             } else {
                System.out.println("Error: Please enter a valid number.");
            }

            scanner.close();
        }
    }
}



