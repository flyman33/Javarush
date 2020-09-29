package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        Set<Integer> set = new TreeSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(reader.readLine());

        while (in.available() > 0) {
            int data = in.read();
            set.add(data);
        }

        reader.close();
        in.close();

        for(Integer a : set) {
            System.out.print(a + " ");
        }
    }
}
