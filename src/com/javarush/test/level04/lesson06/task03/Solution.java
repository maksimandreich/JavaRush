package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sA = bufferedReader.readLine();
        int a = Integer.parseInt(sA);
        String sB = bufferedReader.readLine();
        int b = Integer.parseInt(sB);
        String sC = bufferedReader.readLine();
        int c = Integer.parseInt(sC);
        int min1 = min(a, b, c),mid1 = mid(a, b, c),max1 = max(a, b, c);

        System.out.println(max1);
        System.out.println(mid1);
        System.out.println(min1);
    }

    public static int mid(int a, int b, int c)
    {
        if (a == b && a != c)
        {
            if (a < c)
                return a;
            else
                return c;
        }
        if (a == c && a != b)
        {
            if (a < b)
                return a;
            else
                return b;
        }
        if (a == c && a == b)
        {
            return a;
        }

        if (a > b && a < c) return a;
        if (b > a && b < c) return b;
        if (c < b && c > a) return c;
        return 0;
    }
    public static int min(int a, int b, int c)
    {
        if (a == b && a != c)
        {
            if (a < c)
                return a;
            else
                return c;
        }
        if (a == c && a != b)
        {
            if (a < b)
                return a;
            else
                return b;
        }
        if (a == c && a == b)
        {
            return a;
        }
        if (a < b && a < c) return a;
        if (b < a && b < c) return b;
        if (c < a && c < b) return c;
        return 0;
    }

    public static int max(int a, int b, int c)
    {
        if (a == b && a != c)
        {
            if (a > c)
                return a;
            else
                return c;
        }
        if (a == c && a != b)
        {
            if (a > b)
                return a;
            else
                return b;
        }
        if (a == c && a == b)
        {
            return a;
        }
        if (a > b && a > c) return a;
        if (b > a && b > c) return b;
        if (c > a && c > b) return c;
        return 0;
    }
}
