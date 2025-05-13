package org.example.ders10;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Rauf", 25);
        System.out.println(person1);
        Person person2 = new Person(2, "Mehri", 24);
        System.out.println(person2);

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5, 10));
        System.out.println(calculator.sum(5.5, 10.3));
        System.out.println(calculator.sum(1, 2, 3));

        Product product = new Product(101, "Laptop", 1500.99);
        System.out.println(product);
    }
}
