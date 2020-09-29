package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        int x = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sY = reader.readLine();
        int y = Integer.parseInt(sY);

        if((y % 400 == 0) || (y % 100 != 0 && y % 4 == 0)) {
            x = 366;
            System.out.println("количество дней в году: " + x);
        }
        else {
            x = 365;
            System.out.println("количество дней в году: " + x);
        }
    }
}