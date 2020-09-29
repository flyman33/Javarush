package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream(args[0]);

      float countSpaces = 0, countChars = 0;


        while(in.available() > 0) {
            int i = in.read();
            if(i == ' ') {
                //countChars++;
                countSpaces++;
            }
            countChars++;
        }
        in.close();

        System.out.printf("%.2f", countSpaces / countChars * 100);


    }
}
