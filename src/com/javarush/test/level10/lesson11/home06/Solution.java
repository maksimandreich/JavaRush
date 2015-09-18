package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human man1 = new Human("Майкл");

        Human man2 = new Human("Майкл","Джоржан");
        Human man3 = new Human("Майкл","Джоржан","Россия");
        Human man4 = new Human("Майкл","Джоржан","Россия","Москва");
        Human man5 = new Human("Майкл","Джоржан","Россия","Москва",25);
        Human man6 = new Human("Майкл","Джоржан","Россия","Москва",987,4568);

        Human man7 = new Human("Майкл",1);
        Human man8 = new Human("Майкл",1,2);
        Human man9 = new Human("Майкл","Джоржан","Россия","Москва",22);
        Human man10 = new Human("Майкл","Джоржан","Россия","Москва",22,34);

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(man3);
        System.out.println(man4);
        System.out.println(man5);
        System.out.println(man6);

        System.out.println(man7);
        System.out.println(man8);
        System.out.println(man9);
        System.out.println(man10);
    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String a;
        String b;
        String c;
        String d;
        Integer e;
        Integer f;
        public Human(String a){
            this.a=a;
        }
        public Human(String a,Integer e){
            this.a=a;
            this.e=e;
        }
        public Human(String a,Integer e,Integer f){
            this.a=a;
            this.e=e;
            this.f=f;
        }
        public Human(String a,String b){
            this.a=a;
            this.b=b;
        }
        public Human(String a,String b,String c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public Human(String a,String b,String c,Integer e){
            this.a=a;
            this.b=b;
            this.c=c;
            this.e=e;
        }
        public Human(String a,String b,String c,Integer e,Integer f){
            this.a=a;
            this.b=b;
            this.c=c;
            this.e=e;
            this.f=f;
        }

        public Human(String a,String b,String c,String d){
            this.a=a;
            this.b=b;
            this.c=c;
            this.d=d;
        }
        public Human(String a,String b,String c,String d,Integer e){
            this.a=a;
            this.b=b;
            this.c=c;
            this.d=d;
            this.e=e;
        }
        public Human(String a,String b,String c,String d,Integer e,Integer f){
            this.a=a;
            this.b=b;
            this.c=c;
            this.d=d;
            this.e=e;
            this.f=f;
        }

    }
}
