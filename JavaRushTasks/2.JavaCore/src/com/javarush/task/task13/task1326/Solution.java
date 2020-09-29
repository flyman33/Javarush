package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        ArrayList<Integer> list = new ArrayList<>();
        String line;

        while((line = fileReader.readLine()) != null) {
           int a = Integer.parseInt(line);
            if(a % 2 == 0) {
                list.add(a);
            }
        }

        reader.close();
        fileReader.close();
        Collections.sort(list);

        for(int a : list) {
            System.out.println(a);
        }

    }
}
