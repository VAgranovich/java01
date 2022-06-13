package ru.gb.vagranovich.homework_2_2;

public class MyArrayDataException extends NumberFormatException {

    MyArrayDataException (int i, int j, String k) {
        super("В ячейке массива i=" + i+", j="+j + " находится символьная строка '" + k + "'");
    }
}
