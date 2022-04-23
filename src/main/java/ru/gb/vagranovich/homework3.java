package ru.gb.vagranovich;

import java.lang.reflect.Array;
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
        int l = new Random().nextInt(10) + 1;
        int[][] arr = new int[l][l];
        System.out.println(l);
        for (int i = 0; i < l; i++) {
            arr[i][i] = 1;
            arr[i][l - i - 1] = 1;
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static int[] task5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void task6() {
        int l = new Random().nextInt(10) + 1;
        int max, min;
        int[] arr = new int[l];
        min = 2147483647;
        max = -2147483648;
        for (int i = 0; i < l; i++) {
            arr[i] = new Random().nextInt(1000);
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max = " + max + "; " + "Min = " + min + ";");
    }

    public static boolean task7(int[] arr) {
        int leftSum = 0;
        int rightSum;
        int i = 0;
        do {
            rightSum = 0;
            leftSum = leftSum + arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                rightSum = rightSum + arr[j];
            }
            i++;
        } while ((leftSum < rightSum) && (i < arr.length));
        //System.out.println("LeftSum = " + leftSum + "; " + "RightSum = " + rightSum + ";");
        return (leftSum == rightSum);
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        //  задание №5
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int iValue = scanner.nextInt();
        int[] arr5 = task5(l, iValue);
        System.out.println(Arrays.toString(arr5));
        scanner.close();

        task6();

        //  задание №7
        l=10;
        int[] arr7 = new int[l];
        for (int i = 0; i < l; i++) {
            arr7[i] = new Random().nextInt(10);
        }
        System.out.println(Arrays.toString(arr7));
        System.out.print(task7(arr7));

    }
}
