package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hippodrome {

    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() {
        for(int i = 1; i <= 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move() {
       for(Horse s : horses) {
           s.move();
       }
    }

    public void print() {
        for(Horse s : horses) {
            s.print();
        }
        for(int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        Horse horse = null;
        double max = 0;

        for(Horse s : horses) {
            if(s.getDistance() >= max) {
                max = s.getDistance();
                horse = s;
            }
        }

        return horse;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) {

        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Jack", 3, 0));
        horses.add(new Horse("Mike", 3, 0));
        horses.add(new Horse("Olivia", 3, 0));

        game = new Hippodrome(horses);
        game.run();
        game.printWinner();

    }
}
