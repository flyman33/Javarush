package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {


        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();

        System.setOut(consoleStream);

        String s = outputStream.toString();

        String[] arr = s.split(" ");
        switch (arr[1]) {
            case "+":
                System.out.println(arr[0] + " + " + arr[2] + " = " + (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2])));
                break;
            case "-":
                System.out.println(arr[0] + " - " + arr[2] + " = " + (Integer.parseInt(arr[0]) - Integer.parseInt(arr[2])));
                break;
            case "*":
                System.out.println(arr[0] + " * " + arr[2] + " = " + (Integer.parseInt(arr[0]) * Integer.parseInt(arr[2])));
                break;
        }

    }
        public static class TestString {
            public void printSomething() {
                System.out.println("3 + 6 = ");
            }
        }


}