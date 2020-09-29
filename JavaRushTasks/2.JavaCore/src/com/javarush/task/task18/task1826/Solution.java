package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {


        if(args[0].equals("-e")) {
            FileInputStream in = new FileInputStream(args[1]);
            FileOutputStream out = new FileOutputStream(args[2]);

            while(in.available() > 0) {
                int data = in.read() + 97;
                out.write(data);
            }
            in.close();
            out.close();

        } else if(args[0].equals("-d")) {
            FileInputStream in = new FileInputStream(args[1]);
            FileOutputStream out = new FileOutputStream(args[2]);

            while(in.available() > 0) {
                int data = in.read() - 97;
                out.write(data);
            }
            in.close();
            out.close();
        }

    }

}
