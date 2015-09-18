package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException, ParseException
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat formater = new SimpleDateFormat("MMM",Locale.ENGLISH);

        String input = reader.readLine();
        Date myDate = formater.parse(input.toUpperCase());
        int myMonth = myDate.getMonth()+1;
        System.out.println(input + " is " + myMonth + " month");
    }

}
