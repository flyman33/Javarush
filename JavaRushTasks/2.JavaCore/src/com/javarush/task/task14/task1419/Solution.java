package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalMonitorStateException();
        } catch (IllegalMonitorStateException e) {
            exceptions.add(e);
        }

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            throw new ArrayStoreException();
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }

        try {
            throw new ClassCastException();
        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
            throw new StringIndexOutOfBoundsException();
        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            throw new NumberFormatException();
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            throw new SecurityException();
        } catch (SecurityException e) {
            exceptions.add(e);
        }

        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            exceptions.add(e);
        }
    }

}
