package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileOutputStream out = new FileOutputStream(reader.readLine(), true);
        BufferedInputStream buf = new BufferedInputStream(new FileInputStream(reader.readLine()), 100);
        BufferedInputStream buf2 = new BufferedInputStream(new FileInputStream(reader.readLine()), 100);
//        FileInputStream in = new FileInputStream(reader.readLine());
//        FileInputStream in2 = new FileInputStream(reader.readLine());
        int i;
        while((i = buf.read()) != -1) {
            out.write(i);
        }

        while((i = buf2.read()) != -1) {
            out.write(i);
        }

        out.close();
        buf.close();
        buf2.close();

    }
}
