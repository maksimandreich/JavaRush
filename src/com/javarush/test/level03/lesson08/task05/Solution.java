package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        String name3 = bufferedReader.readLine();
        //String sNumb1 = bufferedReader.readLine();
        //String sNumb2 = bufferedReader.readLine();

        //int number1 = Integer.parseInt(sNumb1);
        //int number2 = Integer.parseInt(sNumb2);

        System.out.print(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}