package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man stas = new Man("Stas",30,"asdaasdas");
        Man peter = new Man("Peter",14,"asdas asdaasdas");

        Woman katya = new Woman("Katya",23,"a asdas asdaasdas");
        Woman sveta = new Woman("Sveta",44,"asd asas asdas asdaasdas");
        //выведи их на экран тут
        System.out.println(stas);
        System.out.println(peter);
        System.out.println(katya);
        System.out.println(sveta);
    }

    //добавьте тут ваши классы
    public static class Man
    {
        String name;
        int age;
        String address;

        public Man(String name,int age,String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }

        public String toString(){
            return name + " " + age + " " + address;
        }

    }

    public static class Woman
    {
        String name;
        int age;
        String address;

        public Woman(String name,int age,String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }

        public String toString(){
            return name + " " + age + " " + address;
        }

    }

}
