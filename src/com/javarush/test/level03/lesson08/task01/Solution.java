package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sAge = bufferedReader.readLine();
        String name = bufferedReader.readLine();
        int nAge = Integer.parseInt(sAge);

        /*Scanner scanner = new Scanner(System.in);
        int nAge = scanner.nextInt();
        String name = scanner.nextLine();
        */
        System.out.print(name + " захватит мир через " + nAge + " лет. Му-ха-ха!");
    }
}