package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException  {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader bufferedReader = new BufferedReader(reader);
        String fileSourceName = reader.readLine();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileSourceName));
        String s;
        while(true) {
            s = reader.readLine();
            bufferedWriter.write(s + "\n");
            if(s.equals("exit")) {
                break;
            }
        }

        reader.close();
        bufferedWriter.close();
    }
}
