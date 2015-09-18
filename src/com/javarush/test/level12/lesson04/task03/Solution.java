package com.javarush.test.level12.lesson04.task03;

/* Пять методов print с разными параметрами
Написать пять методов print с разными параметрами.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }
    public static void print(int i){
        System.out.println(i);
    }
    public static void print(Integer i){
        System.out.println(i);
    }
    public static void print(String str){
        System.out.println(str);
    }
    public static void print(String str,int i){
        System.out.println(str + " " + i);
    }
    public static void print(String str,int i,String str2){
        System.out.println(str + " " + i + " " + str2);
    }
}
