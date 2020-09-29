package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class Solution {



    public static void main(String[] args) throws IOException  {

        FileInputStream in = new FileInputStream(args[0]);

        int count = 0;
        int i;
        while((i = in.read()) > 0) {
            if((i >= 'A' && i <= 'Z')
                || (i >= 'a' && i <= 'z')) {
                count++;
            }
        }

        in.close();

        System.out.println(count);


    }
}
