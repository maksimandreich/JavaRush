package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human child1 = new Human("Кирилл", true, 6);
        Human child2 = new Human("Виталий",true,3);
        Human child3 = new Human("Мира",false,1);
        ArrayList<Human> children = new ArrayList<Human>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human father = new Human("Максим",true,32,children);
        Human mother = new Human("Елена",false,31,children);

        ArrayList<Human> childrenMother = new ArrayList<Human>();
        childrenMother.add(mother);
        ArrayList<Human> childrenFather = new ArrayList<Human>();
        childrenFather.add(father);

        Human grandFather1 = new Human("Андрей",true,55,childrenFather);
        Human grandMother1 = new Human("Ольга",false,55,childrenFather);

        Human grandFather2 = new Human("Валерий",true,60,childrenMother);
        Human grandMother2 = new Human("Галина",false,58,childrenMother);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human(String name,boolean sex,int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
            children = new ArrayList<Human>();
        }
        Human(String name,boolean sex,int age,ArrayList<Human> children){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
