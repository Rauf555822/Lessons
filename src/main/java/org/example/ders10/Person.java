package org.example.ders10;

class Person {

    public int id;
    public String name;
    public int age;

    public Person () {}
    public Person (int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
    }

    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}






