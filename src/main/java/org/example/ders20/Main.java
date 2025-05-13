package org.example.ders20;

import java.util.*;

public class Main {
    public static void main(String[]args) {
        List<String> names = new LinkedList<>();
        names.add("Aysel");
        names.add("Mehman");
        names.add("Rauf");
        names.add("Elton");
        names.add("Elnur");
        names.add("Mehri");
        names.add("Tamerlan");
        names.add("Nicat");
        names.add("Nihat");
        names.add("Elnur");

        System.out.println(names);

        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.addAll(names);
        System.out.println(uniqueNames);

        Set<String> adlar = new LinkedHashSet<>();
        adlar.addAll(names);
        System.out.println(adlar);

        Set<String> ad = new TreeSet<>();
        ad.addAll(names);
        System.out.println(ad);

    }
}
