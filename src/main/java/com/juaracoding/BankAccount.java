package com.juaracoding;

public class BankAccount {

    int acc_no;
    String name;
    double amount;

    public void setAccount ( int a, String n,double amt){
        acc_no = a;
        name = n;
        amount = amt;
    }
    public double deposit ( double amt){
        amount = amount + amt;
        System.out.println(amt + " deposited");
        return amount;
    }

    public double withdraw ( double amt){
        if (amount < amt) {
            System.out.println("Isufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }
        return amount;
    }
    public void checkBalance () {
        System.out.println("Balance is: " + amount);
    }
    public void display () {
        System.out.println(acc_no + " " + name + " " + amount);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccount(121067, "Randi", 1000.0);

        account.display();
        account.checkBalance();

        account.deposit(100.0);
        account.checkBalance();

        account.withdraw(2000);
        account.checkBalance();
    }
}