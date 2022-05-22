package ru.gb.vagranovich.homework7;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
        satiety = p.plateStatus();
    }

    public boolean infoSatiety () {
        return satiety;
    }

    public String getCatName () {
        return this.name;
    }


}
