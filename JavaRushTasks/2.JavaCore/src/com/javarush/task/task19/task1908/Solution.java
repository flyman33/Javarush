package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        StringBuilder builder = new StringBuilder();

        while(file1.ready()) {
            builder.append(file1.readLine());
        }

        String[] s = builder.toString().split(" ");

        for(String a : s) {
            if(a.matches("\\d+")) file2.write(a + " ");
        }

        file1.close();
        file2.close();

    }
}
