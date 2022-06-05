package ru.gb.vagranovich;

import ru.gb.vagranovich.homework_2_1.*;

public class Main {

    public static void main(String[] args) {
        Somebody[] somebodies = {
                new People("���������", 350, 2),
                new People("����", 250, 1),
                new Robot("������", 1350, 5),
                new Robot("X10", 1350, 5),
                new Cat("�����", 150, 2),
                new Cat("�����", 250, 3)

        };

        Barrier[] barriers = {
                new Wall(1),
                new Track(200),
                new Wall(3),
                new Track(400)
        };

        for (Somebody somebody : somebodies) {
            for (Barrier barrier : barriers) {
                barrier.overcome(somebody);
            }
        }
        System.out.println();
        for (Somebody somebody : somebodies) {
            if (somebody.isActive()) {
                System.out.println(somebody + " ������� �����������");
            }

        }
    }
}
