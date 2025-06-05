package org.example.ders15;

public class Car extends Neqliyyat {
    @Override
    public void start() {
        System.out.println("vasiteni ise salir");
    }

    @Override
    public void stop() {
        System.out.println("vasiteni saxlayir");
    }

    @Override
    public void fuelType() {
        System.out.println("yanacaq");
    }
}