package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream in = new FileInputStream(reader.readLine());

        int min = Integer.MAX_VALUE;
        while(in.available() > 0) {
            int data = in.read();
            if(min > data) min = data;
        }

        System.out.println(min);

        reader.close();
        in.close();
    }
}
