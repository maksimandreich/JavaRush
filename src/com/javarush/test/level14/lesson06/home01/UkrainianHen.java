package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Максим on 17.08.2015.
 */
public class UkrainianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth(){
        return 5;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.",Country.UKRAINE,getCountOfEggsPerMonth());
    }
}
