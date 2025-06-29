package org.example.ders60;

public class Student {
    String name;
    int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    String getStatus() {
        if (grade >= 90)
            return "excellent";
        else if (grade >= 70)
            return "good";
        else if (grade >= 50)
            return "enough";
        else return "not enough";

    }
}
