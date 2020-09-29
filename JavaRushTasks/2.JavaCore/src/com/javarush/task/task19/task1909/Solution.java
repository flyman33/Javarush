package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        StringBuilder builder = new StringBuilder();
        String done = "";

        while(file1.ready()) {
           builder.append(file1.readLine());
        }

        done = builder.toString().replace(".", "!");

        file2.write(done);

        file1.close();
        file2.close();

    }
}
