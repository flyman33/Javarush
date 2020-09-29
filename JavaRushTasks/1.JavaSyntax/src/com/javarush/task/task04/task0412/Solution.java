package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        int a = Integer.parseInt(sA);

        if(a > 0)
            System.out.println(a = a * 2);
        else if (a < 0)
            System.out.println(++a);
        else if (a == 0)
            System.out.println(0);

    }

}