package org.example.ders11;

public class Shape {
    String color;
    double area;

    double calculateArea(){
        return 0.0;

    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.radius = 5.7;
        rectangle.width= 7.7;
        rectangle.height = 5.7;

        circle.calculateArea();
        rectangle.calculateArea();
    }
}
