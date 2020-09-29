package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(isDateOdd("JANUARY 2 2000"));
    }

    public static boolean isDateOdd(String date) throws Exception {
        DateFormat df = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date d = df.parse(date);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(d);

        if(calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0)
        return true;
        else return false;

    }
}

