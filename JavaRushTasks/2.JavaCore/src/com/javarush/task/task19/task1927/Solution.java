package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream console = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream out = new PrintStream(outputStream);

        System.setOut(out);

        testString.printSomething();

        System.setOut(console);

        String[] s = outputStream.toString().split("\n");
        int i = 0;

        for(String a : s) {
            System.out.println(a);
            i++;
            if((i % 2) == 0) System.out.println("JavaRush - курсы Java онлайн");
        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
