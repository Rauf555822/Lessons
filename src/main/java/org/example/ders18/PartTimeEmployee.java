package org.example.ders18;

public class PartTimeEmployee extends Employee {
        @Override
    public void calculateSalary() {
            setSalary(1800);
            System.out.println("Yarım ştatlı işçinin maaşı: " +getSalary() + "AZN");
        }
        @Override
    public void getBenefits() {
            System.out.println("Yarım ştatlı işçinin imtiyazları: Yalnız saatlıq maaş");
    }
    @Override
    public void workDetails(){
            setName("Elvin");
        System.out.println("Yarım ştatlı işçinin adı: " +getName());
        System.out.println("Yarım ştatlı işçinin işi: Freelancer kimi işləyir");
    }

}
