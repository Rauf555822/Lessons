package org.example.ders50;

public class BankAccountImpl1 implements BankAccount1{
    @Override
    public void deposit (double amount) {
        System.out.println(amount);
    }
    @Override
    public void withdraw (double amount) {
        System.out.println(amount);
    }
    @Override
    public double getBalance() {
        return 5.45;
    }

}
