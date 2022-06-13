package ru.gb.vagranovich.homework_2_2;

public class Main {
    public static void main(String[] args) {
        String[][] table44Num = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] table44Str = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "H"},
                {"9", "10", "11", "12"},
                {"13", "14", "K", "16"}
        };
        String[][] table45Num = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
                {"17", "18", "19", "20"}
        };


        try {
            System.out.println("Сумма элементов 1-го массива =" + array(table44Num));

        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Сумма элементов 2-го массива =" + array(table45Num));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Сумма элементов 3-го массива =" + array(table44Str));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

    }

    public static int array(String[][] a) throws MyArraySizeException {

        int s = 0;

        if (a.length != 4) {
            throw new MyArraySizeException();
        }

        for (String[] strings : a) {
            if (strings.length != 4) throw new MyArraySizeException();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                try {
                    s = s + Integer.parseInt(a[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, a[i][j]);
                }

            }
        }

        return s;
    }


}
