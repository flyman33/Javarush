package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        Map<String, Double> map = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        while(reader.ready()) {
            String[] line = reader.readLine().split(" ");

            if(map.containsKey(line[0])) {
                map.put(line[0], map.get(line[0]) + Double.parseDouble(line[1]));
            } else map.put(line[0], Double.parseDouble(line[1]));
        }

        reader.close();

        for(Map.Entry<String, Double> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
