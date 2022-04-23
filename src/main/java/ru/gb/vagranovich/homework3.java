package ru.gb.vagranovich;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homework3 {

    public static void task1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task2() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task4() {
        int l = new Random().nextInt(10)+1;
        int [][] arr = new int[l][l];
        System.out.println(l);
        for (int i = 0; i < l; i++) {
           arr[i][i] = 1;
           arr[i][l-i-1] = 1;
           System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static int [] task5(int len, int initialValue) {
        int [] arr = new int [len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int iValue = scanner.nextInt();
        int [] arr5 = task5(l,iValue);
        System.out.println(Arrays.toString(arr5));
        scanner.close();
    }

}
