package org.example.ders63;

public class Task {
    static class Person {
        private final String name;
        private final int age;
        private final String gender;
        private String address;


        public Person(final String name, final int age, final String gender, final String address) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.address = address;
        }

        public String getPersonInfo(String prefix) {
            return prefix + " " + name + " " + age + " " + gender + " " + address;
        }

        public void updateAddress(String newAddress) {this.address = newAddress;}

        public String getName() {return name;}

        public void printGreeting() {
            System.out.println("Hello! I am a person.");
        }

        public static void main(String[] args) {
            Person person = new Person("Mehman", 53, "Male", "Baku");

            System.out.println(person.getPersonInfo("Meet"));

            person.updateAddress("Nijniy-Novgorod");

            System.out.println("Name: " + person.getName());

            person.printGreeting();
        }
    }
}
