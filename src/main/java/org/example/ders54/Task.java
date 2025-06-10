package org.example.ders54;

import java.io.*;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name and surname: ");
        String name = scanner.nextLine();
        System.out.println("Your name: " + name);

        try {
            FileWriter writer = new FileWriter("users.txt");
            writer.write(name);
            System.out.println("mentioned name and surname: " + name);
            writer.close();

             } catch (IOException e) {
            System.out.println("The file names are spelled incorrectly: " + e.getMessage());
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
            String text = reader.readLine();
            while (text != null) {
                System.out.println(text);
                break;
            }
            reader.close();
        }catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
