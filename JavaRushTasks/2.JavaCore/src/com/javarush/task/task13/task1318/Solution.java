package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        InputStream r = new FileInputStream(fileName);

        while(r.available() > 0) {
            int data = r.read();
            System.out.print((char)data);
        }

        r.close();
        reader.close();

    }
}