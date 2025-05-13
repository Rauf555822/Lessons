package org.example.ders11;

public class Circle extends Shape {

    double radius;


    @Override
    double calculateArea() {

        double area = Math.PI * radius * radius;

        System.out.println(area);

        return area;

    }
}
