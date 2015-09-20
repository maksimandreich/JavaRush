package com.javarush.test.level14.lesson08.bonus01;

import java.io.NotActiveException;
import java.io.NotSerializableException;
import java.nio.channels.NonWritableChannelException;
import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int a[] = new int[0];
            System.out.print(a[1]);
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            List<String> list = new LinkedList<String>();
            list.add("aaa");
            System.out.print(list.get(1));
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        exceptions.add(new NoSuchElementException());
        exceptions.add(new NullPointerException());
        exceptions.add(new NoSuchFieldException());
        exceptions.add(new NoSuchMethodException());
        exceptions.add(new NonWritableChannelException());
        exceptions.add(new NotActiveException());
        exceptions.add(new NotSerializableException());
    }
}
