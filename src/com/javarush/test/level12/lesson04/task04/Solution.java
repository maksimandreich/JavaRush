package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }
    public static int min(int i, int i2){
        return (i<i2) ? i : i2;
    }
    public static long min(long i, long i2){
        return (i<i2) ? i : i2;
    }
    public static double min(double i, double i2){
        return (i<i2) ? i : i2;
    }
}
