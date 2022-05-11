package ru.gb.vagranovich.homework6;

public class Animal {
    private String name;
    protected int runLimit = 0;
    protected int swimLimit = 0;
    protected static int animalCount = 0;


    public Animal(String name) {
        this.name = name;
        animalCount ++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Кличка животного: " + this.name);
    }

    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " метров");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " метров");
    }

}
