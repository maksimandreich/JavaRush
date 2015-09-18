package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        String newString="";
        int counter=0;
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' ' && !flag){
                Character ss = s.charAt(i);
                newString+=ss.toString().toUpperCase();
                flag=true;
            }else if(s.charAt(i) != ' ' && flag){
                newString+=s.charAt(i);
            }else{
                newString+=s.charAt(i);
                flag=false;
            }
        }
        System.out.println(newString);
    }


}
