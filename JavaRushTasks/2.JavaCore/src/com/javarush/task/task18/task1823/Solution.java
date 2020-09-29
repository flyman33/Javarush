package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while(!(line = reader.readLine()).equals("exit")) {
            ReadThread thread = new ReadThread(line);
            thread.start();
        }

    }

    public static class ReadThread extends Thread {
        FileInputStream in;
        String name;
        public ReadThread(String fileName) throws IOException {
            in = new FileInputStream(fileName);
            name = fileName;
        }

        @Override
        public void run() {
            Map<Integer, Integer> map = new HashMap<>();
            int maxValue = 0;
            int maxRepeat = 0;
            try {
                while(in.available() > 0) {
                    int data = in.read();
                    map.put(data, map.getOrDefault(data, 0) + 1);
                    if (map.get(data) > maxRepeat) maxRepeat = map.get(data);
                }

                for(Map.Entry<Integer, Integer> s : map.entrySet()) {
                    if(s.getValue() > maxValue)  maxValue = s.getValue();
                }

                for(Map.Entry<Integer, Integer> s : map.entrySet()) {
                   if(s.getValue() == maxValue) {
                       resultMap.put(name, s.getKey());
                   }
                }

                System.out.println(resultMap);
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
