package com.javarush.test.level11.lesson06.task02;

/* Домашние животные
Написать три класса: Pet (домашнее животное), Cat(кот) и Dog(собака).
Унаследовать кота и собаку от животного.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Pet
    {
        public String name;
    }

    public class Cat extends Pet
    {
        public String cat;
    }

    public class Dog extends Pet
    {
        public String dog;
    }
}
