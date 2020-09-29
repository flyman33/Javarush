package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Кузнецов", "Сильвестер");
        map.put("Кузнецов", "Владимир");
        map.put("Петров", "Иван");
        map.put("Иванов", "Петр");
        map.put("Сидоров", "Петр");
        map.put("Петров", "Владимир");
        map.put("Васильев", "Антон");
        map.put("Кириенко", "Кирилл");
        map.put("Чебунин", "Роман");
        map.put("Сагдеев", "Антон");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
