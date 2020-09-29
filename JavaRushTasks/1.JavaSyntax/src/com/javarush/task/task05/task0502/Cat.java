package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int one = 0, two = 0;

        if(this.age > anotherCat.age) one++; else if(this.age == anotherCat.age) { one++; two++;} else two++;
        if(this.weight > anotherCat.weight) one++; else if(this.weight == anotherCat.weight) { one++; two++;} else two++;
        if(this.strength > anotherCat.strength) one++; else if(this.strength == anotherCat.strength) { one++; two++;} else two++;
        if(one > two) return true;
        else return false;
    }

    public static void main(String[] args) {

    }
}
