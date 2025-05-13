package org.example.ders16;
public class Main {
    public static void main(String[]args) {
        Student s = new Student();
        s.setName("Orxan");
        s.setAge(25);
        System.out.println("Tələbənin adı: " + s.getName());
        if (s.getAge()>0 && s.getAge()<150){

            System.out.println("Tələbənin yaşı: " + s.getAge());
        } else {
            System.out.println("Yaş doğru deyil");
        }
    }
}
