package org.example.ders40;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Map<String, String>
                phonebook = new HashMap<>();
        phonebook.put ("Tamerlan", "055-656-31-69");
        phonebook.put ("Qabil", "050-311-41-45");
        phonebook.put ("Nicat", "070-939-79-89");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        switch (name) {
            case "Tamerlan" :
                System.out.println("Tamerlan's number: " + phonebook.get("Tamerlan"));
                break;
            case "Qabil" :
                System.out.println("Qabil's number: " + phonebook.get("Qabil"));
                break;
            case "Nicat" :
                System.out.println("Nicat's number: " + phonebook.get("Nicat"));
                break;
            default:
                System.out.println("There is no such person");
                break;


        }


    }
}
