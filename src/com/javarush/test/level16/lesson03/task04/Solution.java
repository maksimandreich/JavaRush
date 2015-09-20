package com.javarush.test.level16.lesson03.task04;

/* Вывод стек-трейса
1. Создать таск - класс public static SpecialThread - на основании интерфейса Runnable
2. SpecialThread должен выводить в консоль свой стек-трейс.
Подсказка: main thread уже выводит в консоль свой стек-трейс.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }
    public static class SpecialThread implements Runnable{
        public void run(){
            StackTraceElement[] stack = Thread.currentThread().getStackTrace();
            System.out.println("*****************");
            for (StackTraceElement e : stack){
                System.out.println(e);
            }
            System.out.println("*****************");
        }
    }
}
