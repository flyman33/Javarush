package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader file1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(args[1]));

        while(file1.ready()) {
            String[] line = file1.readLine().split(" ");

            for(int i = 0; i < line.length; i++) {
                if(line[i].matches(".*\\d.*")) {
                    file2.write(line[i] + " ");
                }
            }
        }
        file1.close();
        file2.close();
    }
}
