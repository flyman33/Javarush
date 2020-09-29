package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        ArrayList<String> list = new ArrayList<>();

        while(true) {
            key = reader.readLine();
            if(key.equals("coder") || key.equals("user") || key.equals("proger") || key.equals("loser")) {
                list.add(key);
            } else break;
        }
        {
            for(int i = 0; i < list.size(); i++) {
                switch (list.get(i)) {
                    case "user": person = new Person.User();
                    break;
                    case "coder": person = new Person.Coder();
                    break;
                    case "loser": person = new Person.Loser();
                    break;
                    case "proger": person = new Person.Proger();
                    break;
                }
                doWork(person); //вызываем doWork
            }



        }
    }

    public static void doWork(Person person) {
       if(person instanceof Person.Coder) {
           ((Person.Coder) person).writeCode();
       }

        if(person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        }

        if(person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }

        if(person instanceof Person.User) {
            ((Person.User) person).live();
        }

    }
}
