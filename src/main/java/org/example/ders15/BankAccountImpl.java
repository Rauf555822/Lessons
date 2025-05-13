package org.example.ders15;

public class BankAccountImpl implements BankAccount {
    @Override
   public void deposit (double amount){
        System.out.println(amount);
    }
    @Override
    public void withdraw (double amount){
        System.out.println(amount);
    }
    @Override
    public double getBalance(){
      return 4.55;
    }
}
