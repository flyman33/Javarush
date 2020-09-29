package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        FileInputStream in1 = new FileInputStream(reader.readLine());
        FileOutputStream out1 = new FileOutputStream(reader.readLine());
        FileOutputStream out2 = new FileOutputStream(reader.readLine());
        reader.close();

        byte[] smallerHalf = new byte[in1.available() / 2];
        byte[] biggerHalf = new byte[in1.available() - smallerHalf.length];
        out1.write(biggerHalf, 0, in1.read(biggerHalf));
        out2.write(smallerHalf, 0, in1.read(smallerHalf));


        in1.close();
        out1.close();
        out2.close();

    }
}
