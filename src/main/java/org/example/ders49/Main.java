package org.example.ders49;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Vaqif", 44);
        System.out.println(person1);
        Person person2 = new Person(2, "Ramiz", 73);
        System.out.println(person2);

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(6, 12));
        System.out.println(calculator.sum(6.6,  12.4));
        System.out.println(calculator.sum(1, 2, 3));

        Product product = new Product(205, "DELL", 1200.99);
        System.out.println(product);

    }
}
