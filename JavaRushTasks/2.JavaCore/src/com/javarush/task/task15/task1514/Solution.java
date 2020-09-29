package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(3.2, "Text");
        labels.put(3.1, "Text1");
        labels.put(3.3, "Text2");
        labels.put(3.4, "Text3");
        labels.put(3.5, "Text4");

    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
