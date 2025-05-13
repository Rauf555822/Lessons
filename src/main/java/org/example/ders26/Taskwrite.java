package org.example.ders26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Taskwrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad və Soyad daxil edin");
        String name = scanner.nextLine();
        System.out.println("Sizin adınız: " + name);

        try {
            FileWriter writer = new FileWriter("users.txt");
            writer.write(name);
            System.out.println("Qeyd olunan ad və soyad: " +name);
            writer.close();


        } catch (IOException e) {
            System.out.println("Fayla adlar doğru yazılmayıb: " + e.getMessage());
        }
        try {
          BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
            String text = reader.readLine();
            while(text != null){
                System.out.println(text);
                break;
            }
            reader.close();
        }catch (IOException e) {
            System.out.println("Xeta: " + e.getMessage());
        }
    }
}
