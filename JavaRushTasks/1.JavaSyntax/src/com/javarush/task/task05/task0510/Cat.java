package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {

    private String name, address, color;
    private int age, weight;

    public void initialize(String name) {
        this.name = name;
        this.color = "Черный";
        this.age = 15;
        this.weight = 10;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Белый";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 10;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 7;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 9;
    }

    public static void main(String[] args) {

    }
}
