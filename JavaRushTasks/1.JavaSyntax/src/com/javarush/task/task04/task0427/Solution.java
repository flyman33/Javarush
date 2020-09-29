package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if(a <= 999 && a >= 1) {
        if ((a % 2 == 0) && (a <= 9)) System.out.println("четное однозначное число");
            else if ((a % 2 != 0) && (a <= 9)) System.out.println("нечетное однозначное число");
            else if ((a % 2 == 0) && (a <= 99) && (a >= 10)) System.out.println("четное двузначное число");
            else if ((a % 2 != 0) && (a <= 99) && (a >= 10)) System.out.println("нечетное двузначное число");
            else if ((a % 2 == 0) && (a <= 999) && (a >= 100)) System.out.println("четное трехзначное число");
            else if ((a % 2 != 0) && (a <= 999) && (a >= 100)) System.out.println("нечетное трехзначное число");
        }
    }
}
