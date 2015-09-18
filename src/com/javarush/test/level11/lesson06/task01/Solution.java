package com.javarush.test.level11.lesson06.task01;

/* Лошадь и пегас
Написать два класса: Horse (лошадь) и Pegas (пегас).
Унаследовать пегаса от лошади.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Horse horse1 = new Horse("Лошадка");
        Pegas pegas = new Pegas("Пегас",2);
    }

    public static class Horse
    {
        public String name;
        public Horse(String name)
        {
            this.name=name;
        }
        public Horse()
        {
        }
    }

    public static class Pegas extends Horse
    {
        int wings;
        public Pegas(String name,int wings){
            this.name=name;
            this.wings=wings;
        }

    }
}
