package org.example.ders22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[]args) {
        Map<String, String>
                phonebook = new HashMap<>();
        phonebook.put("Aysel", "055-906-07-05");
        phonebook.put("Rauf", "055-789-65-43");
        phonebook.put("Mehri", "050-987-65-43");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad daxil edin:");
        String name = scanner.nextLine();

        switch (name){
            case "Mehri" :
                System.out.println("Mehrinin nomresi" + phonebook.get("Mehri"));
                break;

            case "Aysel" :
                System.out.println("Ayselin nomresi" + phonebook.get("Aysel"));
                break;

            case "Rauf" :
                System.out.println("Raufun nomresi" + phonebook.get("Rauf"));
                break;
            default:
                System.out.println("Bele bir sexs yoxdur");
                break;

        }

    }
}
