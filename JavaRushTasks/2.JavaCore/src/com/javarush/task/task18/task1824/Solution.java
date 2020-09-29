package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = " ";
        FileInputStream in = null;
        while(true) {
            try {
                s = reader.readLine();
                in = new FileInputStream(s);
                in.close();
            } catch (FileNotFoundException e) {
                System.out.println(s);
                return;
            }
        }
    }
}
