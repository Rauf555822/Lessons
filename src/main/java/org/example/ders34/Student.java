package org.example.ders34;

import lombok.Data;

@Data
public class Student extends Person {
    private String studentID;
    public Student(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("ID: " +studentID);
    }
    }

