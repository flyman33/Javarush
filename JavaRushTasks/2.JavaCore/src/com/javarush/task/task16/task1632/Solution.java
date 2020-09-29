package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new MyThread());
        threads.add(new MyThread2());
        threads.add(new MyThread3());
        threads.add(new MyThread4());
        threads.add(new MyThread5());

    }

    public static void main(String[] args) {



    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            while(true) {}
        }
    }

    public static class MyThread2 extends Thread {
        @Override
        public void run() {
            if(currentThread().isInterrupted()) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class MyThread3 extends Thread {
        @Override
        public void run() {
            try {
                while(true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class MyThread4 extends Thread implements Message {
        boolean isRun = true;
        @Override
        public void run() {
           while(isRun) {

           }
        }

        @Override
        public void showWarning() {
            if(currentThread().isAlive()) {
                isRun = false;
            }
        }
    }

    public static class MyThread5 extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = "";
        int number, sum;
        @Override
        public void run() {
            while(!(n.equals("N"))) {
                try {
                    number = Integer.parseInt(reader.readLine());
                    sum += number;
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println(sum);
            }
        }
    }

}