package ru.gb.vagranovich.homework_2_3;

import java.util.*;

public class HomeWork_2_3 {

    public static void main(String[] args) {

        //������� �1
        System.out.println("������� �1");
        array();

        //������� �2
        System.out.println("������� �2");
        phonelist();

    }


    public static void array() {
        int MAX_ELEMENTS_OF_ARRAY = 20;
        Random rand = new Random();
        String[] fruits = {"������", "�����", "�����", "�����", "�������", "���������", "��������", "�����", "������", "��������"};

        ArrayList<String> array = new ArrayList<>();

        //��������� ������ �� ��������� ������� ���� �� ��������� fruits, � ��� ����� �������������
        for (int i = 0; i < MAX_ELEMENTS_OF_ARRAY; i++) {
            array.add(fruits[rand.nextInt(fruits.length)]);
        }

        //��������� ������ � ��������������� �������, ��������� �� ������ array
        HashSet<String> unicArray = new HashSet<>(array);


        System.out.println("�������� ����� ����");
        System.out.println(array);

        System.out.println("���������� ����� ����");
        System.out.println(unicArray);

        System.out.println("������� ���������� ����");
        int count = 0;
        for (String s : unicArray) {
            for (int i = 0; i < MAX_ELEMENTS_OF_ARRAY; i++) {
                if (s.equals(array.get(i))) {
                    count++;
                }
            }
            System.out.println(s + " ����������� " + count + " ���(�)");
            count = 0;
        }
    }

    private static void phonelist() {
        Directory directory = new Directory();

        directory.add("������", "8612");
        directory.add("������", "8613");
        directory.add("������", "8614");
        directory.add("�������", "8615");
        directory.add("������", "8616");
        directory.add("������", "8617");
        directory.add("������", "8618");
        directory.add("�����", "8619");
        directory.add("�����", "8620");
        directory.add("��������", "8621");


        System.out.println("������ ��������� � �������� ������ " + directory.get("������"));
        System.out.println("������ ��������� � �������� ������ " + directory.get("������"));
        System.out.println("������ ��������� � �������� ������ " + directory.get("������"));
        System.out.println("������ ��������� � �������� �������� " + directory.get("��������"));

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


