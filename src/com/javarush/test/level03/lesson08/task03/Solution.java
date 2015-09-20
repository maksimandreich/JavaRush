package com.javarush.test.level03.lesson08.task03;

/* Скромность украшает человека
Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!
Пример: Тимур зарабатывает $5,000. Ха-ха-ха!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        //String sNumb1 = bufferedReader.readLine();
        //String sNumb2 = bufferedReader.readLine();

        //int number1 = Integer.parseInt(sNumb1);
        //int number2 = Integer.parseInt(sNumb2);

        System.out.print(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}