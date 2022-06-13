package ru.gb.vagranovich.homework_2_2;

public class MyArraySizeException extends Exception {

    MyArraySizeException() {
        //System.out.println("Поймали исключение: массив не соответствует размерности 4х4");
        super("Массив не соответствует размерности 4х4");
    }


}
