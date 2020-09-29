package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedInputStream buf = new BufferedInputStream(new FileInputStream(reader.readLine()));
        FileOutputStream out = new FileOutputStream(reader.readLine());

        byte[] b = new byte[buf.available()];
        buf.read(b);
        String[] s = new String(b).split(" ");

        StringBuilder builder = new StringBuilder();

        for(String a : s) {
           builder.append(Math.round(Double.parseDouble(a)) + " ");
        }

        byte[] done = builder.toString().getBytes();

        out.write(done);

        buf.close();
        out.close();
    }
}
