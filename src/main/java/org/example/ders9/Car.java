package org.example.ders9;

class Car extends Vehicle {

    @Override
    void move() {
       super.move();
        System.out.println("maşın hərəkət edir.");
    }

    void horn() {

        System.out.println("siqnal verilir!");
    }

}
