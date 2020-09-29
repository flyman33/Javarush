package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(reader.readLine());
        byte[] b = new byte[in.available()];
        in.read(b);

        String[] s = new String(b).split("\n");

        for(String a : s) {
            if(a.startsWith(args[0] + " ")) {
            System.out.println(a);
            }
        }

        in.close();
    }
}
