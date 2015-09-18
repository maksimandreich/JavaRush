package com.javarush.test.level14.lesson08.home09;

public abstract class Money
{
    private double mount = 5.00;
    public Money()
    {
        this.mount=getAmount();
    }

    public double getAmount(){
        return this.mount;
    }

    public abstract String getCurrencyName();
}

