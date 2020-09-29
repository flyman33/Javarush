package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<>();


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream in = new FileInputStream(reader.readLine());
        FileOutputStream out = new FileOutputStream(reader.readLine());
        reader.close();

        while(in.available() > 0) {
            int data = in.read();
            list.add(data);
        }

        Collections.reverse(list);
        for(int i = 0; i < list.size(); i++) {
            out.write(list.get(i));
        }

        in.close();
        out.close();

    }
}
