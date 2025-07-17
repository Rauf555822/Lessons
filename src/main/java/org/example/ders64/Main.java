package org.example.ders64;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Mehman", 53);
        System.out.println(person1);
        Person person2 = new Person(2, "Nurlana", 51);
        System.out.println(person2);

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(8,16));
        System.out.println(calculator.sum(6.7,5.5));
        System.out.println(calculator.sum(4, 7,1));

        Product product = new Product(225, "Phone", 570);
        System.out.println(product);
    }
}
