package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        List<String> list = new ArrayList<>();
//        while (true) {
//            String family = reader.readLine();
//            if (family.isEmpty()) {
//                break;
//            }
//
//            list.add(family);
//        }

        Map<String, String> map = new HashMap<>();
        while(true) {
            String city = reader.readLine();
            if(city.isEmpty()) break;

            String family = reader.readLine();
            if(family.isEmpty()) break;

            map.put(city, family);

        }

        String n = reader.readLine();
        for(Map.Entry<String, String> m : map.entrySet()) {
            if(n.equals(m.getKey())) System.out.println(m.getValue());
        }


        // Read the house number
//        int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (0 <= houseNumber && houseNumber < list.size()) {
//            String familyName = list.get(houseNumber);
//            System.out.println(familyName);
//        }
    }
}
