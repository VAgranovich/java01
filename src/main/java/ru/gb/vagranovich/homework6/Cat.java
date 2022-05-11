package ru.gb.vagranovich.homework6;

public class Cat extends Animal {
    protected static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;

    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот " + getName() + " не умеет плавать");
    }

    @Override
    public void run(int distance) {
        super.runLimit = 200;
        if (distance <= runLimit & distance > 0) {
            System.out.println("Кот " + getName() + " пробежал " + distance + " метров");
        } else if (distance > runLimit & distance > 0) {
            System.out.println("Кот " + getName() + " пробежал " + runLimit + " метров");
        } else {
            System.out.println("Кот " + getName() + " ничего не пробежал");
        }


    }
}
