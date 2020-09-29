package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        char[] a = string.toCharArray();
        for(int i = 0; i < a.length; i++) {
            if((i > 0 && a[i - 1] == ' ') || (i == 0)) {
                a[i] = Character.toUpperCase(a[i]);
            }
        }

        System.out.println(a);
    }
}
