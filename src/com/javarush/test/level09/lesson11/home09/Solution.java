package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Василий",new Cat("Васек"));
        map.put("Барсик",new Cat("Барсек"));
        map.put("Арамис",new Cat("Арамисик"));
        map.put("Кот4",new Cat("Котик4"));
        map.put("Кот5",new Cat("Котик5"));
        map.put("Кот6",new Cat("Котик6"));
        map.put("Кот7",new Cat("Котик7"));
        map.put("Кот8",new Cat("Котик8"));
        map.put("Кот9",new Cat("Котик9"));
        map.put("Кот10",new Cat("Котик10"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        return new HashSet<Cat>(map.values());
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {

            this.name = name;
        }

        public String toString()
        {

            return "Cat "+this.name;
        }
    }
}
