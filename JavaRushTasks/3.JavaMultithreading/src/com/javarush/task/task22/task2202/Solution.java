package com.javarush.task.task22.task2202;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        StringBuilder sb = new StringBuilder();
        if(string == null || string.split(" ").length < 5) throw new TooShortStringException();

        String[] arr = string.split(" ");

        for(int i = 1; i < 5; i++) {
            sb.append(arr[i] + " ");
        }

        return sb.toString().trim();
    }

    public static class TooShortStringException extends RuntimeException {
    }

}
