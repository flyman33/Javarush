package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        Map<Character, Integer> map = new TreeMap<>();

        FileInputStream in = new FileInputStream(args[0]);

        while(in.available() > 0) {
            int data = in.read();
            map.put((char)data, map.getOrDefault((char)data, 0 ) + 1);
        }

        for(Map.Entry<Character, Integer> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }

        in.close();

    }
}
