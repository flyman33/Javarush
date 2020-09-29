package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args)  throws IOException {

        BufferedReader readerLine = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        FileReader reader = new FileReader(readerLine.readLine());
        FileWriter writer = new FileWriter(readerLine.readLine());
        readerLine.close();

        while(reader.ready()) {
            list.add(reader.read());
        }

        for(int i = 0; i < list.size(); i++) {
            if((i + 1) % 2 == 0) {
                writer.write(list.get(i));
            }
        }

        reader.close();
        writer.close();

    }
}
