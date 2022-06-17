package ru.gb.vagranovich.homework_2_3;

import java.util.*;

public class HomeWork_2_3 {

    public static void main(String[] args) {

        //задание №1
        System.out.println("Задание №1");
        array();

        //задание №2
        System.out.println("Задание №2");
        phonelist();

    }


    public static void array() {
        int MAX_ELEMENTS_OF_ARRAY = 20;
        Random rand = new Random();
        String[] fruits = {"яблоко", "груша", "арбуз", "банан", "черника", "смородина", "виноград", "слива", "малина", "клубника"};

        ArrayList<String> array = new ArrayList<>();

        //формируем массив со случайным набором слов из заготовки fruits, в том числе повторяющихся
        for (int i = 0; i < MAX_ELEMENTS_OF_ARRAY; i++) {
            array.add(fruits[rand.nextInt(fruits.length)]);
        }

        //объявляем массив с неповторящимися словами, созданный на основе array
        HashSet<String> unicArray = new HashSet<>(array);


        System.out.println("Исходный набор слов");
        System.out.println(array);

        System.out.println("Уникальный набор слов");
        System.out.println(unicArray);

        System.out.println("Подсчет повторений слов");
        int count = 0;
        for (String s : unicArray) {
            for (int i = 0; i < MAX_ELEMENTS_OF_ARRAY; i++) {
                if (s.equals(array.get(i))) {
                    count++;
                }
            }
            System.out.println(s + " встречается " + count + " раз(а)");
            count = 0;
        }
    }

    private static void phonelist() {
        Directory directory = new Directory();

        directory.add("Иванов", "8612");
        directory.add("Иванов", "8613");
        directory.add("Петров", "8614");
        directory.add("Сидоров", "8615");
        directory.add("Павлов", "8616");
        directory.add("Павлов", "8617");
        directory.add("Павлов", "8618");
        directory.add("Дымов", "8619");
        directory.add("Быков", "8620");
        directory.add("Степанов", "8621");


        System.out.println("Номера телефонов с фамилией Иванов " + directory.get("Иванов"));
        System.out.println("Номера телефонов с фамилией Петров " + directory.get("Петров"));
        System.out.println("Номера телефонов с фамилией Павлов " + directory.get("Павлов"));
        System.out.println("Номера телефонов с фамилией Степанов " + directory.get("Степанов"));

    }

}

class Directory {
    private final HashMap<String, List<String>> directory = new HashMap<>();

    public void add(String surname, String phone_number) {
        List<String> phone_number_list;
        if (directory.containsKey(surname)) {
            phone_number_list = directory.get(surname);
            phone_number_list.add(phone_number);
            directory.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory.get(surname);
    }

}


