package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int neg = 0, pos = 0;

        if(a > 0 && a != 0) pos ++;
        else if(a < 0 && a != 0) neg++;
        if(b > 0 && b != 0) pos ++;
        else if(b < 0 && b != 0) neg++;
        if(c > 0 && c != 0) pos ++;
        else if(c < 0 && c != 0) neg++;

        System.out.println("количество отрицательных чисел: " + neg);
        System.out.println("количество положительных чисел: " + pos);
    }
}
