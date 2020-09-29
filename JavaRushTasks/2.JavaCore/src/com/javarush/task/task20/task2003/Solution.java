package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {

        Properties properties = new Properties();

        for(Map.Entry<String, String> s : runtimeStorage.entrySet()) {
            properties.setProperty(s.getKey(), s.getValue());
        }

        properties.store(outputStream, "");

    }

    public static void load(InputStream inputStream) throws IOException {

        Properties properties = new Properties();
        properties.load(inputStream);

        for(String s : properties.stringPropertyNames()) {
            runtimeStorage.put(s, properties.getProperty(s));
        }

//       BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//
//       while(reader.ready()) {
//           String s = reader.readLine();
//           String[] a = s.split("=");
//           runtimeStorage.put(a[0].trim(), a[1].trim());
//       }

    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
