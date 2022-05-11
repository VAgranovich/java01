package ru.gb.vagranovich.homework6;

public class Cat extends Animal {
    protected static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;

    }

    @Override
    public void swim(int distance) {
        System.out.println("��� " + getName() + " �� ����� �������");
    }

    @Override
    public void run(int distance) {
        super.runLimit = 200;
        if (distance <= runLimit & distance > 0) {
            System.out.println("��� " + getName() + " �������� " + distance + " ������");
        } else if (distance > runLimit & distance > 0) {
            System.out.println("��� " + getName() + " �������� " + runLimit + " ������");
        } else {
            System.out.println("��� " + getName() + " ������ �� ��������");
        }


    }
}
