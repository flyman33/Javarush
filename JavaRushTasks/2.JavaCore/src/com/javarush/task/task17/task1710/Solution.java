package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {

    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        switch (args[0]) {
           case "-c":
               Date dateCreate = new SimpleDateFormat("dd/MM/y", Locale.ENGLISH).parse(args[3]);

               if (args[2].equals("м")) allPeople.add(Person.createMale(args[1], dateCreate));
               if (args[2].equals("ж")) allPeople.add(Person.createFemale(args[1], dateCreate));
               System.out.println(allPeople.size() - 1);
               break;

            case "-u": if(args[3].equals("м")) {
                allPeople.set(Integer.parseInt(args[1]), Person.createMale(args[2], new SimpleDateFormat("dd/MM/y", Locale.ENGLISH).parse(args[4])));
            } else allPeople.set(Integer.parseInt(args[1]), Person.createFemale(args[2], new SimpleDateFormat("dd/MM/y", Locale.ENGLISH).parse(args[4])));
                break;

            case "-d": allPeople.get(Integer.parseInt(args[1])).setName(null);
                    allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
                allPeople.get(Integer.parseInt(args[1])).setSex(null);
                break;

            case "-i":
                System.out.println(allPeople.get(Integer.parseInt(args[1])));
                break;
        }

    }
}
