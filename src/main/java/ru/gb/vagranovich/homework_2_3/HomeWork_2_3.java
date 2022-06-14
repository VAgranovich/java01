package ru.gb.vagranovich.homework_2_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class HomeWork_2_3 {

    public static void main(String[] args) {
        int MAX_ELEMENTS_OF_ARRAY = 20;
        Random rand = new Random();
        String[] fruits = {"яблоко","груша", "арбуз", "банан", "черника", "смородина", "виноград", "слива", "малина","клубника"};

        ArrayList<String> array = new ArrayList<>();

        //формируем массив со случайным набором слов из заготовки fruits, в том числе повторяющихся
        for (int i = 0; i<MAX_ELEMENTS_OF_ARRAY; i++) {
            array.add(fruits[rand.nextInt(fruits.length)]);
        }

        //объявляем массив с неповторящимися словами, созданный на основе array
        HashSet<String> unicArray = new HashSet<>(array);


        System.out.println("Исходный набор слов");
        System.out.println(array);

        System.out.println("Уникальный набор слов");
        System.out.println(unicArray);

        System.out.println("Подсчет повторений слов");
        int count =0;
        for (String s : unicArray) {
            for (int i=0; i< MAX_ELEMENTS_OF_ARRAY; i++) {
                if (s == array.get(i)) {
                    count ++;
                }
            }
            System.out.println(s+ " встречается "+count + " раз(а)");
            count =0;
        }


    }
}
