package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();

        System.out.println(getCountTheSameFirstName(map, "Максим"));
        System.out.println(getCountTheSameLastName(map, "Капустин"));
    }
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Лабутин","Максим");
        map.put("Аронов","Илья");
        map.put("Буровников","Игорь");
        map.put("Меандров","Илья");
        map.put("Капустин","Симон");
        map.put("Юдаков","Максим");
        map.put("Аронова","Вадим");
        map.put("Капустина","Игорь");
        map.put("Шевченко","Максим");
        map.put("Кравченко","Юлий");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count=0;
        for (Map.Entry<String,String> it : map.entrySet()){
            if(it.getValue().contains(name)){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //напишите тут ваш код
        return map.containsKey(familiya) ? 1 : 0;
    }
}
