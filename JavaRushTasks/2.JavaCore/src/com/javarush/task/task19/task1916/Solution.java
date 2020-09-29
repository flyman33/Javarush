package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {

        List<String> file1Content = new ArrayList<>();
        List<String> file2Content = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while(file1.ready()) {
            file1Content.add(file1.readLine());
        }

        while(file2.ready()) {
            file2Content.add(file2.readLine());
        }

        while(file1Content.size() > 1 || file2Content.size() > 1) {
            if(file1Content.get(0).equals(file2Content.get(0))) {
                lines.add(new LineItem(Type.SAME, file2Content.get(0)));
                file1Content.remove(0);
                file2Content.remove(0);
            } else if(file1Content.get(1).equals(file2Content.get(0))) {
                lines.add(new LineItem(Type.REMOVED, file1Content.get(0)));
                file1Content.remove(0);
            } else if(file1Content.get(0).equals(file2Content.get(1))) {
                lines.add(new LineItem(Type.ADDED, file2Content.get(0)));
                file2Content.remove(0);
            }
        }

        if(file1Content.size() == 0) lines.add(new LineItem(Type.ADDED, file2Content.get(0)));
        if(file2Content.size() == 0) lines.add(new LineItem(Type.REMOVED, file1Content.get(0)));

        file1.close();
        file2.close();

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
