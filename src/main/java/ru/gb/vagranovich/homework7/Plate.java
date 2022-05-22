package ru.gb.vagranovich.homework7;

public class Plate {
    private int food;
    private boolean lackOfFood = false;

    //1. ������� ���, ����� � ������� � ���� �� ����� ���������� �������������� ���������� ���
    //(��������, � ����� 10 ���, � ��� �������� �������� 15-20).

    public Plate(int food) {
        this.food = Math.max(food, 0);
    }

    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            lackOfFood=false;
        } else {
            lackOfFood = true;
        }
    }

    public void increaseFood(int n) {
        if (n>0) {
            food += n;
            lackOfFood = false;
        }
    }

    public boolean plateStatus() {
        return lackOfFood;
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
