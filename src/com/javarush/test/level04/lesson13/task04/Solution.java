package com.javarush.test.level04.lesson13.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        String str = "";
        for (int y = 1; y <= 10; y++)
        {
            str += "8";
        }
        System.out.println(str);
        for (int i = 1;i <= 10; i++)
        {
            System.out.println("8");
        }
    }
}
