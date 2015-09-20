package com.javarush.test.level03.lesson06.task03;

/* Семь цветов радуги
Выведи на экран текст - семь цветов радуги.
В каждой строке должно быть по три цвета, в последней - один.
Цвета в строках разделяй пробелом.
Запомни: буквы Ё в тестах нигде нет.
Чтобы тесты проходили правильно, во всех задачах заменяй Ё на Е.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        String[] colors = {"красный","оранжевый","желтый","зеленый","голубой","синий","фиолетовый"};
        int cnt = 1;
        String str = "";
        for (int i = 0; i < colors.length;i++){
            if (cnt == 3){
                cnt = 1;
                System.out.println(str + colors[i]);
                str = "";
            }else
            {
                if (i == (colors.length - 1))
                {
                    str += colors[i];
                    cnt++;
                }else{
                    str += colors[i] + " ";
                    cnt++;
                }
            }
        }
        System.out.println(str);
    }
}
