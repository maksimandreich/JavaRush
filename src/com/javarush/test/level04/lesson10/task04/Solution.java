package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int i = 0, x = 0;
        String str = "";
        while (i++ < 10)
        {
            str = "";
            x = 0;
            while (x++ < 10)
                str += "S";
            System.out.println(str);
        }
    }
}
