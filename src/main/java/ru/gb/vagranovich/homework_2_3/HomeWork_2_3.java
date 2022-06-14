package ru.gb.vagranovich.homework_2_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class HomeWork_2_3 {

    public static void main(String[] args) {
        int MAX_ELEMENTS_OF_ARRAY = 20;
        Random rand = new Random();
        String[] fruits = {"������","�����", "�����", "�����", "�������", "���������", "��������", "�����", "������","��������"};

        ArrayList<String> array = new ArrayList<>();

        //��������� ������ �� ��������� ������� ���� �� ��������� fruits, � ��� ����� �������������
        for (int i = 0; i<MAX_ELEMENTS_OF_ARRAY; i++) {
            array.add(fruits[rand.nextInt(fruits.length)]);
        }

        //��������� ������ � ��������������� �������, ��������� �� ������ array
        HashSet<String> unicArray = new HashSet<>(array);


        System.out.println("�������� ����� ����");
        System.out.println(array);

        System.out.println("���������� ����� ����");
        System.out.println(unicArray);

        System.out.println("������� ���������� ����");
        int count =0;
        for (String s : unicArray) {
            for (int i=0; i< MAX_ELEMENTS_OF_ARRAY; i++) {
                if (s == array.get(i)) {
                    count ++;
                }
            }
            System.out.println(s+ " ����������� "+count + " ���(�)");
            count =0;
        }


    }
}
