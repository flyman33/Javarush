package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Кузнецов", dateFormat.parse("MARCH 3 1994"));
        map.put("Петров", dateFormat.parse("APRIL 1 1995"));
        map.put("Иванов", dateFormat.parse("JUNE 1 1995"));
        map.put("Сидоров", dateFormat.parse("JULY 1 1995"));
        map.put("Кузьмин", dateFormat.parse("AUGUST 1 1995"));
        map.put("Васильев", dateFormat.parse("AUGUST 1 1995"));
        map.put("Кириенко", dateFormat.parse("NOVEMBER 1 1995"));
        map.put("Чебунин", dateFormat.parse("OCTOBER 1 1995"));
        map.put("Сагдеев", dateFormat.parse("DECEMBER 1 1995"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

       Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
       while(iterator.hasNext()) {
           int value = iterator.next().getValue().getMonth();
           if(value == 5 || value == 6 || value == 7) {
               iterator.remove();
           }
       }


    }

    public static void main(String[] args) {
    }
}
