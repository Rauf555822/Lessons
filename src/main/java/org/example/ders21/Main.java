package org.example.ders21;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> person = new LinkedList<>();

        person.add("Rauf Abdurehimov 17");
        person.add("Mehri Quliyeva 17");
        person.add("Rauf Abdurehimov 17");
        person.add("Aysel Memmedzade 17");
        person.add("Milana Eskerova 17");
        person.add("Rauf Abdurehimov 17");


        Set<String> uniquePerson = new HashSet<>();
        uniquePerson.addAll(person);

        Set<String> insan = new TreeSet<>();
        insan.addAll(person);

        Set<String> adam = new LinkedHashSet<>();
        adam.addAll(person);

        System.out.println("LinkedList: " + person);
        System.out.println("HashSet: " + uniquePerson);
        System.out.println("TreeSet: " + insan);
        System.out.println("LinkedHashSet: " + adam);
    }
}