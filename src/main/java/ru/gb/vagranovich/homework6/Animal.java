package ru.gb.vagranovich.homework6;

public class Animal {
    private String name;
    private int runLimit;
    private int swimLimit;
    protected int animalCount = 0;


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Кличка животного: " + name);
    }

    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " метров");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " метров");
    }

}
