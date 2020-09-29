package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        Calendar calendar = new GregorianCalendar();

        Map<String, Integer> map = calendar.getDisplayNames(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);

        for(Map.Entry<String, Integer> m : map.entrySet()) {
            if(m.getKey().equals(month)) {
                System.out.println(m.getKey() + " is the " + (m.getValue() + 1) + " month");
            }
        }


    }
}
