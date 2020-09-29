package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());

        reader.close();

        if(input < 0) {
            System.out.println(0);
        } else if(input <= 150) {
            System.out.println(factorial(input));
        }
    }

    public static String factorial(int n) {

        BigInteger ret = BigInteger.ONE;
        for(int i = 1; i <= n; ++i) {
            ret = ret.multiply(BigInteger.valueOf(i));
        }

        return String.valueOf(ret);

    }
}
