package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Vaska", 3, 6, 7);
        Cat cat2 = new Cat("Murzik", 4, 5, 8);
        Cat cat3 = new Cat("Barsik", 5, 7, 6);

        if(cat1.fight(cat2)) System.out.println("Победил: " + cat1.name);
        else System.out.println("Победил: " + cat2.name);
        if(cat2.fight(cat3)) System.out.println("Победил: " + cat2.name);
        else System.out.println("Победил: " + cat3.name);
        if(cat1.fight(cat3)) System.out.println("Победил: " + cat1.name);
        else System.out.println("Победил: " + cat3.name);
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
