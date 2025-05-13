package org.example.ders11;

public class Rectangle extends Shape {

    double width;
    double height;


    @Override
    double calculateArea() {
        double area = width * height;
        System.out.println(area);
        return area;


    }

}
