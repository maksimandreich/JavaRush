package com.javarush.test.level03.lesson04.task01;

/* Дата рождения
Вывести на экран дату своего рождения в виде: MAY 1 2012
*/
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.text.ParseException;

public class Solution
{
    public static void main(String[] args)
    {
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        try {
            date = simpleDateFormat.parse("04.01.1983");
            System.out.println(simpleDateFormat2.format(date).toUpperCase());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}