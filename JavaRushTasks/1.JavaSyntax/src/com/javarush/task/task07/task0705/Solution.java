package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[20];
        int[] a = new int[10];
        int[] b = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for(int i = 0; i < arr.length; i++) {
            if(i < 10){
                a[i] = arr[i];
            } else if(i > 9){
                b[i - 10] = arr[i];
            }
        }

        for(int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
