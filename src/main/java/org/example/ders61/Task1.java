package org.example.ders61;

import java.util.Scanner;

public class Task1 {
  public static class WeeklyActivity {
      public static void main(String[] args) {
          String[]days = {
                  "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
          };

          String [] activities = {
                  "drive car", "go to university", "exercise", "watching film", "running", "sleeping", "listen to music"
          };

          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the number of the week (1-7): ");

          if (scanner.hasNextInt()) {
              int dayNumber = scanner.nextInt();

              if (dayNumber >= 1 && dayNumber <= 7) {
                  System.out.println(days[dayNumber - 1] + " - " + activities[dayNumber - 1]);
              } else {
                  System.out.println("Error: Please enter an integer between 1 and 7");
              }
          } else {
              System.out.println("Error: Please enter correct number");
          }

          scanner.close();
      }
  }
}
