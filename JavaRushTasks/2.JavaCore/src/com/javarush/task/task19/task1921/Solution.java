package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws ParseException, IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));


        while(reader.ready()) {
            String[] line = reader.readLine().split(" ");
            String dateString = line[line.length - 3] + " " + line[line.length - 2] + " " + line[line.length - 1];
            StringBuilder nameString = new StringBuilder();
            for(int i = 0; i < line.length - 3; i++) {
                nameString.append(line[i] + " ");
            }

            Date date = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH).parse(dateString);
            PEOPLE.add(new Person(nameString.toString().trim(), date));
        }
        reader.close();

        for(Person s : PEOPLE) {
            System.out.println(s.getName() + " " + s.getBirthDate());
        }

    }
}
