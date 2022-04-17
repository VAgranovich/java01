package ru.gb.vagranovich.homework2;

public class HomeWorkApp {

    public static boolean compareDigits(int a, int b) {
        //������� 1
        int c = a + b;
        return (c > 10 && c <= 20);
    }

    public static void posNegDigit(int a) {
        //������� 2
        if (a >= 0) {
            System.out.println("����� " + a + " - �������������");
        } else {
            System.out.println("����� " + a + " - �������������");
        }

    }

    public static boolean negDigit(int a) {
        return a < 0;
    }

    public static void print(String letter, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(letter);
        }
    }

    public static boolean year(int b) {
        int b100 = b % 100;
        int b400 = b % 400;
        int b4 = b % 4;

        return ((b100 == 0 && b400 == 0) || (b4 == 0 && b100 != 0));
        
    }

    public static void main(String[] args) {

        //������� 1
        int a = -10;
        int b = 20;
        boolean compare = compareDigits(a, b);

        System.out.println(compare);

        //������� 2
        posNegDigit(a);

        //������� 3
        boolean neg = negDigit(a);
        System.out.println(neg);

        //������� 4
        String text = "Hello, world!";
        int n = 3;
        print(text, n);

        // ������� 5
        int c = 2000;
        boolean vis = year(c);
        System.out.println(vis);
    }
}
