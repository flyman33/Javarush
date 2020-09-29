package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
            map.put("Кузнецов", "Владимир");
            map.put("Сидоров", "Александр");
            map.put("Кобылкин", "Дмитрий");
            map.put("Петров", "Василий");
            map.put("Иванов", "Владимир");
            map.put("Кузьмин", "Владимир");
            map.put("Кузнецов", "Иван");
            map.put("Иванов", "Петр");
            map.put("Кузнецов", "Вячеслав");
            map.put("Сидоров", "Петр");
            map.put("Кукушкин", "Петр");
            map.put("Чебунин", "Вячеслав");
            map.put("Кириенко", "Петр");
            map.put("Сагдеев", "Петр");

        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int sum = 0;
        for(Map.Entry<String, String> m : map.entrySet()) {
            String s = m.getValue();
            if(name.equals(s)) {
                sum += 1;
            }
        }

        return sum;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int sum = 0;
        for(Map.Entry<String, String> m : map.entrySet()) {
            String s = m.getKey();
            if(lastName.equals(s)) {
                sum += 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
    }
}
