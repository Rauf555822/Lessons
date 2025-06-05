package org.example.ders49;

public class Person {

    public int ID;
    public String name;
    public int age;

    public Person () {}
    public Person (int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public String toString() { return "Person [ID = " + ID + ", name = "+ name + ", age=" + age + "]";
    }
}
