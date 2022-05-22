package ru.gb.vagranovich.homework7;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(5);

        Cat[] cat1 = {
                new Cat("Барсик", 3),
                new Cat("Перси", 5),
                new Cat("Мурзик", 1),
                new Cat("Пушок", 1)
        };

        // Работаем с одним котом
        plate.info();
        cat.eat(plate);
        if (cat.infoSatiety()) {
            System.out.println("Кот " + cat.getCatName() + " голоден");
        } else
        {
            System.out.println("Кот " + cat.getCatName() + " сытый");
        }
        plate.info();
        System.out.println("-------------------------------------");

        // увеличиваем кол-во еды в тарелке
        plate.increaseFood(5);

        // Работаем с массивом котов
        for (Cat value : cat1) {
            plate.info();
            value.eat(plate);
            if (value.infoSatiety()) {
                System.out.println("Кот " + value.getCatName() + " голоден");
            } else {
                System.out.println("Кот " + value.getCatName() + " сытый");
            }
        }

    }
}
