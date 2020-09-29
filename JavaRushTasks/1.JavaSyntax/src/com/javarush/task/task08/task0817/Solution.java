package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
       Map<String, String> map = new HashMap<>();
        map.put("Сталлоне", "Сильвестер");
        map.put("Кузнецов", "Владимир");
        map.put("Петров", "Иван");
        map.put("Иванов", "Петр");
        map.put("Сидоров", "Петр");
        map.put("Кузьмин", "Владимир");
        map.put("Васильев", "Антон");
        map.put("Кириенко", "Кирилл");
        map.put("Чебунин", "Роман");
        map.put("Сагдеев", "Антон");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String, String> m1 : map.entrySet()) {
            for(Map.Entry<String, String> m2 : map.entrySet()) {
                if(m1.getValue().equals(m2.getValue()) & m1 != m2) {
                    list.add(m1.getValue());
                }
            }

        }

        for(String s : list) {
            removeItemFromMapByValue(map, s);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
