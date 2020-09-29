package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        while (true) {

            String sId = reader.readLine();
            if (sId.equals("")) {
                break;
            } else {
                int id = Integer.parseInt(sId);

                String name = reader.readLine();

//                if (name.equals("")) {
//                    break;
//                }
                map.put(name, id);
            }
        }
            for (HashMap.Entry<String, Integer> s : map.entrySet()) {
                System.out.println(s.getValue() + " " + s.getKey());
            }


    }
}