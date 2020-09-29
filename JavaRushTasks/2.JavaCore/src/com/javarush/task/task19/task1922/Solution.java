package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();


        while (fileReader.ready()) {
            int repeat = 0;

            String line = fileReader.readLine();
            String[] lineArr = line.split(" ");

            for(int i = 0; i < lineArr.length; i++) {
                for(int j = 0; j < words.size(); j++) {
                    if(lineArr[i].equals(words.get(j)) || lineArr[i].toUpperCase().equals(words.get(j))) repeat++;
                }
            }
            if(repeat == 2) {
                System.out.println(line);
            }

        }
        fileReader.close();
    }
}