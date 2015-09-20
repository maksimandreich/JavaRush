package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Администратор on 31.08.2015.
 */
public class USD extends Money
{
    private double amount;
    public USD(double amount)
    {
        super(amount);
        this.amount=amount;
    }

    public String getCurrencyName(){
        return "USD";
    }
    public double getAmount(){
        return this.amount;
    }
}
