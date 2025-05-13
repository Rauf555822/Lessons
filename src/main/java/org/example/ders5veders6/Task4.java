package org.example.ders5veders6;

public class Task4 {
    static class Person {
        // Fields (4 dənə)
        private final String name;
        private final int age;
        private final String gender;
        private String address;

        // Constructor
        public Person(String name, int age, String gender, String address) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.address = address;
        }

        // Method 1: Request və response dolu olsun
        public String getPersonInfo(String prefix) {
            return prefix + " " + name + " is " + age + " years old, gender: " + gender + ", address: " + address;
        }

        // Method 2: Request dolu, response boş olsun
        public void updateAddress(String newAddress) {
            this.address = newAddress;
        }

        // Method 3: Request boş, response dolu olsun
        public String getName() {
            return name;
        }

        // Method 4: Request və response boş olsun
        public void printGreeting() {
            System.out.println("Hello! I am a person.");
        }

        // java.main.Main metodu main.test üçün
        public static void main(String[] args) {
            Person person = new Person("Rauf", 18, "Male", "Baku");

            // Method 1: Request və response dolu
            System.out.println(person.getPersonInfo("Meet"));

            // Method 2: Request dolu, response boş
            person.updateAddress("Berlin");

            // Method 3: Request boş, response dolu
            System.out.println("Name: " + person.getName());

            // Method 4: Request və response boş
            person.printGreeting();
        }
    }
}
