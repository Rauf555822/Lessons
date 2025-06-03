package org.example.ders45;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Albert");
        names.add("Ayxan");
        names.add("Tural");
        names.add("Arzu");
        names.add("Elmir");
        names.add("Ayxan");
        names.add("Niyazi");
        names.add("Albert");
        names.add("Ruslan");
        names.add("Arzu");

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


