package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human grandFather1 = new Human("Иван", true, 77);
        Human grandFather2 = new Human("Олег", true, 79);

        Human grandMother1 = new Human("Ирина", false, 73);
        Human grandMother2 = new Human("Анна", false, 74);

        Human father = new Human("Виктор", true, 44);
        Human mother = new Human("Ольга", false, 43);

        Human child1 = new Human("Владимир", true, 15);
        Human child2 = new Human("Андрей", true, 16);
        Human child3 = new Human("Наталья", false, 14);

        grandFather1.children.add(father);
        grandMother1.children.add(father);

        grandFather2.children.add(mother);
        grandMother2.children.add(mother);

        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
