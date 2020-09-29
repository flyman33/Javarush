package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Parameter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileString = reader.readLine();
        reader.close();

        Path filePath = Paths.get(fileString);
        List<String> textLines = Files.readAllLines(filePath);
        StringBuilder sb = new StringBuilder();
        for (String s : textLines) {
            sb.append(s).append(" ");
        }

        String string = sb.toString().trim();
        String[] s = string.split(" ");
           for(int i = 0; i < s.length - 1; i++) {
               for(int j = i + 1; j < s.length; j++) {
                   StringBuilder reverse = new StringBuilder(s[j]).reverse();
                   if(s[i].equals(reverse.toString())) {
                       if(!result.contains(new Pair(s[i], s[j])))
                        result.add(new Pair(s[i], s[j]));
                   }
               }
           }

       for(Pair pair :result) {
           System.out.println(pair);
       }

    }

    public static class Pair {
        String first;
        String second;

        public Pair() {

        }

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
