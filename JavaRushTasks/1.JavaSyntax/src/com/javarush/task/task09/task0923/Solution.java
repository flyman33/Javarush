package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> a = new ArrayList<>();
        ArrayList<Character> b = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

//        for(int i = 0; i < list.size(); i++) {
////            if(list.get(i).equals(' ')) {
////                a.remove(i);
////            }
//            if(isVowel(list.get(i))) {
//                a.add(list.get((i)));
//            } else {
//                b.add(list.get(i));
//            }
//        }

        Iterator<Character> iterator = list.iterator();
        while(iterator.hasNext()) {
            Character f = iterator.next();
            if(f.equals(' ')) {
               iterator.remove();
            } else if(isVowel(f)) {
                a.add(f);
            } else {
                b.add(f);
            }
        }

        for(Character x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
        for(Character x : b) {
            System.out.print(x + " ");
        }


    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}