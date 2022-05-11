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
            System.out.println("��� "+getName() + " �������� " + distance + " ������");
        } else if (distance > runLimit & distance > 0) {
            System.out.println("��� "+getName() + " �������� " + runLimit + " ������");
        } else {
            System.out.println("��� "+getName() + " ������ �� ��������");
        }

    }

    @Override
    public void swim(int distance) {
        super.swimLimit = 50;
        if (distance <= swimLimit & distance > 0) {
            System.out.println("��� "+getName() + " ������� " + distance + " ������");
        } else if (distance > swimLimit & distance > 0) {
            System.out.println("��� "+getName() + " ������� " + swimLimit + " ������");
        } else {
            System.out.println("��� "+getName() + " ������ �� �������");

        }
    }
}
