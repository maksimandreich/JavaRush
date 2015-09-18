package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        //Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
        Human grandpa1 = new Human("Андрей",true,60);
        Human grandpa2 = new Human("Валерий",true,65);
        Human grandma1 = new Human("Ольга",false,60);
        Human grandma2 = new Human("Галина",false,65);
        Human mother = new Human("Елена",false,31,grandpa2,grandma2);
        Human father = new Human("Максим",true,32,grandpa1,grandma1);
        Human child1 = new Human("Кирилл",true,6,father,mother);
        Human child2 = new Human("Виталий",true,3,father,mother);
        Human child3 = new Human("Настя",false,1,father,mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandma1);
        System.out.println(grandpa1);
        System.out.println(grandma2);
        System.out.println(grandpa2);
    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }

        public Human(String name,boolean sex,int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }

        public Human(String name,boolean sex,int age, Human parent1,Human parent2){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=parent1;
            this.mother=parent2;
        }
    }

}
