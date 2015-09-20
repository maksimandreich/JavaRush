package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer m = Integer.parseInt(reader.readLine());
        Integer n = Integer.parseInt(reader.readLine());
        /*
        Integer c = a>b ? a : b;
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 2;i<=c;i=i+2){
            if (a%i==0 && b%i==0){
                list.add(i);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
        */
        System.out.println( greatestCommonDivisor( m, n ) );
    }

        private static int greatestCommonDivisor( int m, int n )
        {
            // Базовый случай:
            if ( m == n )
            {
                return m;
            }
            if ( m == 0 )
            {
                return n;
            }
            if ( n == 0 )
            {
                return m;
            }

            // Рекурсивный случай:
            if ( ( ~m & 1 ) == 1 ) // m четное
            {
                if ( ( n & 1 ) == 1 ) // n четное
                {
                    return greatestCommonDivisor( m >> 1, n );
                }
                else // m и n четные
                {
                    return greatestCommonDivisor( m >> 1, n >> 1 ) << 1;
                }
            }
            if ( ( ~n & 1 ) == 1 ) // m нечетное, n четное
            {
                return greatestCommonDivisor( m, n >> 1 );
            }

            // уменьшение большего аргумента:
            if ( m > n )
            {
                return greatestCommonDivisor( ( m - n ) >> 1, n );
            }

            return greatestCommonDivisor( ( n - m ) >> 1, m );
        }
}
