package org.example.ders47;

import org.example.ders16.Student;

public class MainTask {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nicat");
        student.setAge(35);
        System.out.println("Student's name: " +student.getName());
        if (student.getAge()>0 && student.getAge()<200) {

            System.out.println("Student's age: " +student.getAge());
        } else {
            System.out.println("The age is not correct");
        }
    }
}
