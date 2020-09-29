package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> strings = new ArrayList<>();
        int min = 10;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        for(int i = 0; i < strings.size(); i++) {
            if(min > strings.get(i).length())
                min = strings.get(i).length();
            }

        for(int i = 0; i < strings.size(); i++) {
            if(min == strings.get(i).length())
                System.out.println(strings.get(i));
        }
        }

    }

