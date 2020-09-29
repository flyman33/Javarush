package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {

       InputStream in = new FileInputStream(args[0]);
       OutputStream out = new FileOutputStream(args[1]);

        Charset utf8 = Charset.forName("UTF-8");
        Charset windows1251 = Charset.forName("Windows-1251");

        byte[] buffer = new byte[1000];
        in.read(buffer);
        String s = new String(buffer, windows1251);
        buffer = s.getBytes(utf8);
        out.write(buffer);

    }
}
