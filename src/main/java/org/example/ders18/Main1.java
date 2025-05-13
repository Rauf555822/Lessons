package org.example.ders18;

public class Main1 {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();

        fullTimeEmployee.workDetails();
        fullTimeEmployee.calculateSalary();
        fullTimeEmployee.getBenefits();


        System.out.println();

        partTimeEmployee.workDetails();
        partTimeEmployee.calculateSalary();
        partTimeEmployee.getBenefits();

    }
}
