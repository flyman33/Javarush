package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Vladimir", 25, "Moscow");
        Man man2 = new Man("Alexei", 26,"Irkutsk");
        System.out.println(man1.name + " " + man1.age + " " + man1.address );
        System.out.println(man2.name + " " + man2.age + " " + man2.address );

        Woman woman1 = new Woman("Maria", 25, "Angarsk");
        Woman woman2 = new Woman("Svetlana", 23,"Omsk");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address );
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address );
    }

   public static class Man {
        String name, address;
        int age;

        public Man() {}

        public Man(String name) {
            this.name = name;
        }

       public Man(String name, String address) {
           this.name = name;
           this.address = address;
       }

       public Man(String name, int age, String address) {
           this.name = name;
           this.address = address;
           this.age = age;
       }
    }

    public static class Woman {
        String name, address;
        int age;

        public Woman() {}

        public Woman(String name) {
            this.name = name;
        }

        public Woman(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }


}
