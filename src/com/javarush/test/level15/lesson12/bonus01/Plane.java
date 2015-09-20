package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by Администратор on 05.09.2015.
 */
public class Plane implements Flyable
{
    private int passangers;
    @Override
    public void fly()
    {

    }
    public Plane(int passangers){
        this.passangers=passangers;
    }
}
