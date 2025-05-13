package org.example.ders18;

public class FullTimeEmployee extends Employee {
        @Override
                public void calculateSalary() {
            setSalary(3500);
            System.out.println("Tam ştatlı işçinin maaşı: " + getSalary() + "AZN");
        }
        @Override
                public void getBenefits() {
            System.out.println("Tam ştatlı işçinin imtiyazları: Tibbi sığorta və illik bonus");
        }
        @Override
                public void workDetails() {
            setName("Orxan");
            System.out.println("Tam ştatlı işçinin adı: " +getName());
            System.out.println("Tam ştatlı işçinin işi: Bankda proqramçı işləyir");
        }
    }

