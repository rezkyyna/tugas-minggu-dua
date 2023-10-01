package com.juaracoding;
import org.testng.Assert;
import org.testng.annotations.Test;
public class BankAccountTest {


    @Test
    public void TestDeposit() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccount(165789, "Rani", 2000.0);
        Assert.assertEquals(bankAccount.deposit(100), 2100);
    }

    @Test
    public void withDraw() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccount(12345, "Randi", 1000.0);
        Assert.assertEquals(bankAccount.withdraw(200), 800);
    }
    @Test
    public void withDrawn() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccount(12345, "Randi", 1000.0);
        Assert.assertEquals(bankAccount.withdraw(2000), 1000); //saat testing muncul  message "Isufficient Balance"
    }
}
