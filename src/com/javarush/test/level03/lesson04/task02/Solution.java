package com.javarush.test.level03.lesson04.task02;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        String name = "Максим";
        String str = "";
        for (int i = 0; i < 5; i++){
            str = str + name + " ";
        }
        for (int i = 0; i < 10; i++){
            //System.out.println(str);
        }

        int x=0;
        while (x<10)
        {
            System.out.println(x);
            x++;
            //x = x + 1;
        }
    }
}