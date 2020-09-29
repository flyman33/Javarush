package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        StringBuilder builder = new StringBuilder();
        BufferedReader file1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(args[1]));

        while(file1.ready()) {
            String[] line = file1.readLine().split(" ");

            for(String s : line) {
                if(s.length() > 6) {
                    builder.append(s + ",");
                }
            }
        }
        builder.deleteCharAt(builder.length() - 1);
        file2.write(builder.toString());
        file1.close();
        file2.close();

    }
}
