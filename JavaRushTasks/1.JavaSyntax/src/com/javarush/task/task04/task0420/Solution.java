package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

       int[] m = {a, b, c};

       for(int i = m.length-1 ; i > 0 ; i--) {
           for (int j = 0; j < m.length - 1; j++) {
               if (m[j] < m[j + 1]) {
                   int tmp = m[j];
                   m[j] = m[j + 1];
                   m[j + 1] = tmp;
               }
           }
       }

        for(int i = 0; i < m.length; i++)
            System.out.println(m[i]);
    }
}
