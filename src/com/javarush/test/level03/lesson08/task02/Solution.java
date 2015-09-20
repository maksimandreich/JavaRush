package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры Имя и два числа, вывести надпись:
name1 получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String sNumb1 = bufferedReader.readLine();
        String sNumb2 = bufferedReader.readLine();

        int number1 = Integer.parseInt(sNumb1);
        int number2 = Integer.parseInt(sNumb2);

        System.out.print(name + " получает " + sNumb1 + " через " + number2 + " лет.");
    }
}
