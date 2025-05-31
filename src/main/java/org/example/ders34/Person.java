package org.example.ders34;

import lombok.Data;

@Data
public  class Person {
    private String name;
    private int age;


  public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
    public void printInfo(){
        System.out.println("Ad: " + name);
        System.out.println("Yas: " + age);
    }
}

