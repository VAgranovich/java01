package ru.gb.vagranovich;

public class HomeWork_2_5 {

    private static final int SIZE = 10000000;
    private static final int HALF = SIZE / 2;
    private static final float[] arr = new float[SIZE];

    public static void main(String[] args) {


        long firstMethodTime = firstMethod();

        long secondMethodTime = secondMethod();

        System.out.println("One thread time: " + firstMethodTime + " ms.");
        System.out.println("Two threads time: " + secondMethodTime + " ms.");

    }

    private static long firstMethod() {

        for (int i = 0; i < HomeWork_2_5.arr.length; i++) {
            HomeWork_2_5.arr[i] = 1.0f;
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < HomeWork_2_5.arr.length; i++) {
            HomeWork_2_5.arr[i] = (float) (HomeWork_2_5.arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        return System.currentTimeMillis() - startTime;
    }

    private static long secondMethod() {
        float[] a = new float[HALF];
        float[] b = new float[HALF];

        for (int i = 0; i < HomeWork_2_5.arr.length; i++) {
            HomeWork_2_5.arr[i] = 1.0f;
        }

        long startTime = System.currentTimeMillis();

        System.arraycopy(HomeWork_2_5.arr, 0, a, 0, HALF);
        System.arraycopy(HomeWork_2_5.arr, HALF, b, 0, HALF);

        ArrayCalc t1 = new ArrayCalc(a);
        ArrayCalc t2 = new ArrayCalc(b);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a, 0, arr, 0, HALF);
        System.arraycopy(b, 0, arr, HALF, HALF);

        return System.currentTimeMillis() - startTime;
    }

    static class ArrayCalc extends Thread {
               float[] c;

        ArrayCalc(float[] c) {
            this.c = c;
        }

        @Override
        public void run() {
            for (int i = 0; i < c.length; i++) {
                c[i] = (float) (c[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }


    }

}
