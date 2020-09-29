package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader readLine = new BufferedReader(new InputStreamReader(System.in));

        FileReader reader = new FileReader(readLine.readLine());
        readLine.close();

        StringBuilder builder = new StringBuilder();

        while(reader.ready()) {
           int data = reader.read();
           builder.append((char)data);
        }

        String[] s = builder.toString().split("\\W");
        int count = 0;
        for(String a : s ) {
            if(a.equals("world")) count++;
        }
        System.out.println(count);
        reader.close();

    }
}
