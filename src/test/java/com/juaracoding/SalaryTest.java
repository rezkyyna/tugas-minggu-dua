package com.juaracoding;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SalaryTest {

    @Test
    public void TestSalaryManager(){
        Salary salary = new Salary();
        Assert.assertEquals(Salary.hitungPajak(8000), 800);

    }
    @Test
    public void TestSalaryKaryawan(){
        Salary salary = new Salary();
        Assert.assertEquals(Salary.hitungPajak(6000),0);
    }
}

