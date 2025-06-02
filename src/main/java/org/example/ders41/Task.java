package org.example.ders41;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        List<String> person = new LinkedList<>();

        person.add("Ramil Rafiqov 28");
        person.add("Tamerlan Qaibov 65");
        person.add("Ayxan Orucov 23");
        person.add("Ramil Rafiqov 28");
        person.add("Kamran Quliyev 48");
        person.add("Ramil Rafiqov 28");

        Set<String> uniquePerson = new HashSet<>();
        uniquePerson.addAll(person);

        Set<String> insan = new TreeSet<>();
        insan.addAll(person);

        Set<String> adam = new LinkedHashSet<>();
        adam.addAll(person);

        System.out.println("LinkedList: " +person);
        System.out.println("HashSet: " +uniquePerson);
        System.out.println("TreeSet: " +insan);
        System.out.println("LinkedHashSet: " +adam);
    }
}
