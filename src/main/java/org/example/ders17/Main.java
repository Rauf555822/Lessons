package org.example.ders17;

public class Main {
    public static void main(String[]args) {
        Car c = new Car();
        c.setBrand("BMW");
        c.setSpeed(120);
        System.out.println("Maşının markası:" + c.getBrand());
        if (c.getSpeed()>0 && c.getSpeed()<=300) {

            System.out.println("Maşının sürəti:" +c.getSpeed());
        } else{
            System.out.println("Sürət doğru deyil! Maşının sürəti 0 ilə 300 arasında olmalıdır.");
        }
    }
}
