package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       ArrayList<String> strings = new ArrayList<>();
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       int max = 0;

       for(int i = 0; i < 10; i++) {
           strings.add(reader.readLine());
       }

       int min = strings.get(0).length();

       for(int i = 0; i < strings.size(); i++) {
           if(max < strings.get(i).length())
               max = strings.get(i).length();
       }

       for(int i = 0; i < strings.size(); i++) {
           if(min > strings.get(i).length())
               min = strings.get(i).length();
       }

       for(int i = 0; i < strings.size(); i++) {
           if(max == strings.get(i).length()) {
               System.out.println(strings.get(i));
               break;
           } else if(min == strings.get(i).length()) {
               System.out.println(strings.get(i));
               break;
           }
       }
    }
}
