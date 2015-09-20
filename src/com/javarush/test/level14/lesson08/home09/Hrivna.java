package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Администратор on 31.08.2015.
 */
public class Hrivna extends Money
{
    private double amount;
    public Hrivna(double amount){
        super(amount);
        this.amount=amount;
    }
    public String getCurrencyName(){
        return "HRN";
    }
    public double getAmount(){
        return this.amount;
    }
}
