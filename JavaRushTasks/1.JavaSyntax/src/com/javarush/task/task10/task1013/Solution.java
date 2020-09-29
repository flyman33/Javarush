package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private String name;
        private boolean sex;
        private float weight;
        private String lastName;
        private int dateOfBirth;

        public Human(String name, int age) {}
        public Human(String name, boolean sex) {}
        public Human(String name, String lastName) {}
        public Human(int age, boolean sex) {}
        public Human(int age, String name) {}
        public Human(boolean sex, String lastName) {}
        public Human(boolean sex, int age) {}
        public Human(String name, float weight) {}
        public Human(float weight, boolean sex) {}
        public Human(int age, float weight) {}
    }
}
