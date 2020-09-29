package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        Map<Integer, Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(reader.readLine());
        int maxRepeats = 0;

        while(in.available() > 0) {
           int data = in.read();

           map.put(data, map.getOrDefault(data, 0) + 1);
           if(map.get(data) > maxRepeats)
               maxRepeats = map.get(data);
        }
        reader.close();
        in.close();

        for(Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if(pair.getValue() == maxRepeats)
                System.out.print(pair.getKey() + "  ");
        }



    }
}
