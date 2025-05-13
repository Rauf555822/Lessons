package org.example.ders23;

import java.util.*;

public class LibrarySystem {
    public static void main (String[]args) {
        List<String> books = new ArrayList<>();
        books.add("Kavgam");
        books.add("Silahlara veda");
        books.add("Beyaz olum: Simo Hayha");
        books.add("Qaranliqdaki beyaz adam");
        books.add("Muhendis komputer qrafikasi");
        books.add("Tetbiqi mexanika");
        books.add("Riyazi analiz-2");
        books.add("Oxford Solutions Third Edition Intermediate");
        books.add("Kavgam");
        books.add("Beyaz olum: Simo Hayha");

        Set<String> uniqueBooks = new HashSet<>(books);

        Map<String, String>
                bookCategories = new HashMap<>();
        bookCategories.put("Kavgam", "bedii");
        bookCategories.put("SIlahlara veda", "bedii");
        bookCategories.put("Beyaz olum: Simo Hayha", "bedii");
        bookCategories.put("Qaranliqdaki beyaz adam", "bedii");
        bookCategories.put("Muhendis komputer qrafikasi", "universitet dersliyi");
        bookCategories.put("Tetbiqi mexanika", "universitet dersliyi");
        bookCategories.put("Riyazi analiz-2", "universitet dersliyi");
        bookCategories.put("Oxford Solutions Third Edition Intermediate", "universitet dersliyi");
        System.out.println(bookCategories);
    }
}
