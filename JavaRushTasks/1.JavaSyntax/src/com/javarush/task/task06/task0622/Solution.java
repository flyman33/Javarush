package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] max = new int[5];
        for(int i = 0; i < 5; i++) {
            int b = Integer.parseInt(reader.readLine());
            max[i] = b;
        }

        for(int i = 0; i < max.length; i++) {
            for(int j = 0; j < max.length - 1; j++) {
                if(max[j] > max[j + 1]){
                    int temp = max[j];
                    max[j] = max[j + 1];
                    max[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < max.length; i++) {
            System.out.println(max[i]);
        }

    }
}
