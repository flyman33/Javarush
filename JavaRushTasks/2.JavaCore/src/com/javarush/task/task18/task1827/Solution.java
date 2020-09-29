package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {

        List<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String line;

        while((line = fileReader.readLine()) != null) {
            list.add(line);
        }
        fileReader.close();

        if(args.length != 0) {
            long maxId = Long.MIN_VALUE;

            for(String s: list) {
                int idName = Integer.parseInt(s.substring(0, 8).trim());
                if(idName > maxId) maxId = idName;
            }

            String id = String.valueOf(++maxId).concat("        ").substring(0, 8);
            String productName = args[1].concat("                              ").substring(0, 30);
            String price = args[2].concat("        ").substring(0, 8);
            String quantity = args[3].concat("    ").substring(0, 4);
            String result = id.concat(productName.concat(price.concat(quantity)));
            list.add(result);

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for(int i = 0; i < list.size(); i++) {
                writer.write(list.get(i));
                writer.newLine();
            }
            writer.close();
        }

    }
}
