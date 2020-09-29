package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();


    public static void main(String[] args) throws IOException {
        Solution s = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader fileReader2 = new BufferedReader(new FileReader(reader.readLine()));

        String lineOne;
        String lineTwo;
        while ((lineOne = fileReader.readLine()) != null) {
            allLines.add(lineOne);
        }

        while ((lineTwo = fileReader2.readLine()) != null) {
            forRemoveLines.add(lineTwo);
        }

        s.joinData();
        reader.close();
        fileReader.close();
        fileReader2.close();

    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
