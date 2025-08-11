package org.example.ders66;

import java.awt.print.Book;
import java.util.*;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Kitab> set = new HashSet<>();
        List<Kitab> books = new ArrayList<>();
        Map<Integer, Kitab> map = new HashMap<>();
        System.out.println("Enter the number of books: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter books ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter book title: ");
            String title = scanner.nextLine();

            System.out.println("Enter book author: ");
            String author = scanner.nextLine();

            Kitab book = new Kitab(id, title, author);

            books.add(book);

            if (!map.containsKey(id)) {
                set.add(book);
            }
            map.put(id, book);

        }
        for (Kitab b : map.values())
            set.add(b);
        System.out.println(set);
        System.out.println(books);
        System.out.println(map);
    }
}
