package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Сталлоне", 1300);
        map.put("Кузнецов", 2200);
        map.put("Петров", 50);
        map.put("Иванов", 280);
        map.put("Сидоров", 310);
        map.put("Кузьмин", 2700);
        map.put("Васильев", 850);
        map.put("Кириенко", 100);
        map.put("Чебунин", 700);
        map.put("Сагдеев", 900);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()) {
            if(iterator.next().getValue() < 500)
                iterator.remove();
        }

    }

    public static void main(String[] args) {

    }
}