package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {

    String name, address, color;
    int age, weight;

    public Cat(String name) {
        this.name = name;
        color = "Blue";
        age = 15;
        weight = 20;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        color = "Red";
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, int age) {
        this.name = name;
        color = "Green";
        this.age = age;
        weight = 21;
    }

    public Cat(int weight, String color) {
        this.color = color;
        age = 11;
        this.weight = weight;
    }

    public Cat(int weight, String color, String address) {
        this.color = color;
        age = 11;
        this.weight = weight;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
