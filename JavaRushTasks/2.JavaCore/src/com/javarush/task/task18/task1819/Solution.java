package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());

        BufferedInputStream file1In = new BufferedInputStream(new FileInputStream(file1));
        BufferedInputStream file2In = new BufferedInputStream(new FileInputStream(file2));

        byte[] byte1 = new byte[file1In.available()];
        byte[] byte2 = new byte[file2In.available()];
        int count1 = file1In.read(byte1);
        int count2 = file2In.read(byte2);

        file1In.close();
        file2In.close();

        BufferedOutputStream file1Out = new BufferedOutputStream(new FileOutputStream(file1));

        file1Out.write(byte2, 0, count2);
        file1Out.write(byte1, 0, count1);

        file1Out.close();


    }
}
