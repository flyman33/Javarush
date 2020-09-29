package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();


        ArrayList<String> list = new ArrayList();

        String[] arList = s.split("&");
        String[] obj = null;



        for(int i = 0; i < arList.length; i++) {
            if (i == 0) {
                if(arList[i].contains("obj")) {
                    String o = arList[i].substring(arList[i].indexOf('?') + 1);
                    obj = o.split("=");
                }
                String a = arList[i].substring(arList[i].indexOf('?') + 1, arList[i].indexOf('='));
                list.add(a);
                i++;
            }

                if(arList[i].contains("=")) {
                list.add(arList[i].substring(0, arList[i].indexOf('=')));
                } else list.add(arList[i]);

        }


        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        if(obj != null) {
            try {
                alert(Double.valueOf(obj[1]));
            } catch (NumberFormatException e) {
                alert(obj[1]);
            }
        }
  }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
