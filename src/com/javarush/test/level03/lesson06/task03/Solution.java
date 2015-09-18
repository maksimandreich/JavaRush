package com.javarush.test.level03.lesson06.task03;

/* Семь цветов радуги
Выведи на экран текст - семь цветов радуги.
В каждой строке должно быть по три цвета, в последней - один.
Цвета в строках разделяй пробелом.
Запомни: буквы Ё в тестах нигде нет.
Чтобы тесты проходили правильно, во всех задачах заменяй Ё на Е.
*/

import java.lang.reflect.Array;

public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        String[] colors = {"красный", "оранжевый", "желтый", "зеленый", "голубой", "синий", "фиолетовый"};
        String str = "";
        for (int i = 1; i <= 4; i++){
            str = str + " " +  colors[i];
        }
        System.out.print(str);

    }
}