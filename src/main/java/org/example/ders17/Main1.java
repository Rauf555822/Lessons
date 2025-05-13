package org.example.ders17;

public class Main1 {
    public static void main(String[]args){
        Person p = new Person();
        p.setName("Elvin");
        p.setSalary(3500);
        System.out.println("Adı:" +p.getName());
        if(p.getSalary()>0){
            System.out.println("Maaşı:" +p.getSalary());
        } else{
            System.out.println("Maaş doğru deyil! 0-dan böyük olmalıdır");
        }
    }
}
