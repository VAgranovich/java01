package ru.gb.vagranovich.homework_2_2;

public class MyArrayDataException extends NumberFormatException {

    MyArrayDataException (int i, int j, String k) {
        super("� ������ ������� i=" + i+", j="+j + " ��������� ���������� ������ '" + k + "'");
    }
}
