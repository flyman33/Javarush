package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        String line;
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        while((line = fileReader.readLine()) != null) {
            list.add(line);
        }

        String id;
        String productName;
        String price;
        String quantity;

        if(args.length != 0 && args[0].equals("-u")) {

            id = args[1].concat("        ").substring(0, 8);
            productName = args[2].concat("                              ").substring(0, 30);
            price = args[3].concat("        ").substring(0, 8);
            quantity = args[4].concat("    ").substring(0, 4);

            for(int i = 0; i < list.size(); i++) {
                if(list.get(i).substring(0, 8).equals(id)) {
                    list.set(i, list.get(i).substring(0, 8).concat(productName.concat(price.concat(quantity))));
                }
            }

        } else if(args.length != 0 && args[0].equals("-d")) {

            Iterator<String> iterator = list.iterator();
            while(iterator.hasNext()) {
                if(iterator.next().substring(0, 8).trim().equals(args[1])) {
                    iterator.remove();
                }
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for(String s : list) {
            writer.write(s);
            writer.newLine();
        }

        fileReader.close();
        writer.close();

    }
}
