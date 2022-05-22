package ru.gb.vagranovich.homework7;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(5);

        Cat[] cat1 = {
                new Cat("������", 3),
                new Cat("�����", 5),
                new Cat("������", 1),
                new Cat("�����", 1)
        };

        // �������� � ����� �����
        plate.info();
        cat.eat(plate);
        if (cat.infoSatiety()) {
            System.out.println("��� " + cat.getCatName() + " �������");
        } else
        {
            System.out.println("��� " + cat.getCatName() + " �����");
        }
        plate.info();
        System.out.println("-------------------------------------");

        // ����������� ���-�� ��� � �������
        plate.increaseFood(5);

        // �������� � �������� �����
        for (Cat value : cat1) {
            plate.info();
            value.eat(plate);
            if (value.infoSatiety()) {
                System.out.println("��� " + value.getCatName() + " �������");
            } else {
                System.out.println("��� " + value.getCatName() + " �����");
            }
        }

    }
}
