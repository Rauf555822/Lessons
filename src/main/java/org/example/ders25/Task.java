package org.example.ders25;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        try {
        System.out.print("Yazını daxil edin (null saxlamaq üçün enter-ə bas): ");
         input = scanner.nextLine();
        if (input.trim().isEmpty()) {
            input = null;
        }
            System.out.println("Sizin metniniz: " + input.length());
        } catch (NullPointerException e){
            System.out.println("Hecne daxil etmemisiniz" );
        } finally {
            System.out.println("Proses bitdi");

        }
    }
}
