package ru.gb.vagranovich.homework6;

public class HomeWork6 {
    public static void main(String[] args) {

        Cat cat = new Cat("������");
        Cat cat2 = new Cat("������");
        Cat cat3 = new Cat("�����");

        Dog dog = new Dog ("�����");

        System.out.println();
        cat.run(250);
        cat.swim(50);

        System.out.println();
        cat2.run(50);
        cat2.swim(50);

        System.out.println();
        cat3.run(150);
        cat3.swim(0);

        System.out.println();
        dog.run(650);
        dog.swim(10);

        System.out.println();
        System.out.println("���������� �������� - " + Animal.animalCount + ", � ��� �����: ");
        System.out.println("- ����� - " + Cat.catCount);
        System.out.println("- ����� - " + Dog.dogCount);
    }


}
