package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<String>();
        set.add("Лайка");
        set.add("Лейка");
        set.add("Любовь");
        set.add("Львов");
        set.add("Люкс");
        set.add("Лира");
        set.add("Лонжерон");
        set.add("Ленинград");
        set.add("Лампа");
        set.add("Линейка");
        set.add("Логарифм");
        set.add("Лайкра");
        set.add("Лимб");
        set.add("Лямбда");
        set.add("Лена");
        set.add("Лох");
        set.add("Локомотив");
        set.add("Лунаход");
        set.add("Лоза");
        set.add("Лаванда");
        return set;
    }
}
