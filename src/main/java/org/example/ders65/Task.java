package org.example.ders65;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Telebe> set = new HashSet<>();
        List<Telebe> students = new ArrayList<>();
        Map<Integer, Telebe> map = new HashMap<>();
        System.out.println("Enter 5 students: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter student name: ");
            String name = scanner.nextLine();

            System.out.println("Enter student grade: ");
            int grade = scanner.nextInt();
            scanner.nextLine();
            Telebe student = new Telebe(id, name, grade);

            students.add(student);

            if (!map.containsKey(id)) {
                set.add(student);
            }
            map.put(id, student);

        }
        for(Telebe s : map.values())
            set.add(s);
        System.out.println(set);
        System.out.println(students);
        System.out.println(map);
    }
}

