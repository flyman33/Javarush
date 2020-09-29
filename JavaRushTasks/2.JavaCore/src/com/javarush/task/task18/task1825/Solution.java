package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException  {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        TreeSet<String> set = new TreeSet<>();

        while(!(s = reader.readLine()).equals("end")) {
           set.add(s);
        }

        FileOutputStream out = new FileOutputStream(set.first().substring(0, set.first().lastIndexOf(".part")));

        for(String a : set) {
            FileInputStream in = new FileInputStream(a);
            byte[] buffer = new byte[in.available()];
            in.read(buffer);
            out.write(buffer);
            in.close();
        }

        out.close();



    }
}
