package ru.gb.vagranovich.homework6;

public class Dog extends Animal {
    protected static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;

    }

    @Override
    public void run(int distance) {
        super.runLimit = 500;
        if (distance <= runLimit & distance > 0) {
            System.out.println("Пес "+getName() + " пробежал " + distance + " метров");
        } else if (distance > runLimit & distance > 0) {
            System.out.println("Пес "+getName() + " пробежал " + runLimit + " метров");
        } else {
            System.out.println("Пес "+getName() + " ничего не пробежал");
        }

    }

    @Override
    public void swim(int distance) {
        super.swimLimit = 50;
        if (distance <= swimLimit & distance > 0) {
            System.out.println("Пес "+getName() + " проплыл " + distance + " метров");
        } else if (distance > swimLimit & distance > 0) {
            System.out.println("Пес "+getName() + " проплыл " + swimLimit + " метров");
        } else {
            System.out.println("Пес "+getName() + " ничего не проплыл");

        }
    }
}
