package com.javarush.test.level04.lesson13.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        String str;
        for (int i = 1;i <= 10; i++)
        {
            str = "";
            for (int y = 1; y <= i; y++)
            {
                str += "8";
            }
            System.out.println(str);
        }
    }
}
