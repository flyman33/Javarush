package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static String firstFileName;
    public static String secondFileName;

    static {
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {

        String fullFileName;
        String res = "";
        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent() {
                return res;
        }

        @Override
        public void run() {
            try {
                BufferedReader buf = new BufferedReader(new FileReader(new File(fullFileName)));
                String line;
                while((line = buf.readLine())!= null) {
                    res += line + " ";
                }
                buf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

}
