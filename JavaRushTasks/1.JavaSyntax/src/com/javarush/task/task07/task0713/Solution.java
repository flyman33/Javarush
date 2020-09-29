package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> main = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 0; i < 20; i++) {
            main.add(Integer.parseInt(reader.readLine()));
        }

        for(int i = 0; i < main.size(); i++) {
            if(main.get(i) % 3 == 0 && main.get(i) % 2 == 0) {
                list1.add(main.get(i));
                list2.add(main.get(i));
            } else if(main.get(i) % 3 == 0)
                list1.add(main.get(i));
            else if(main.get(i) % 2 == 0)
                list2.add(main.get(i));
            else list3.add(main.get(i));
        }

        printList(list1);
        System.out.println();
        printList(list2);
        System.out.println();
        printList(list3);
    }

    public static void printList(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
