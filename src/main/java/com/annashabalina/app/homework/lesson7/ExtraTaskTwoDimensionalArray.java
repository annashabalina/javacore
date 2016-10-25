package com.annashabalina.app.homework.lesson7;

/**
 * Created by Пользователь on 25.10.2016.
 */
public class ExtraTaskTwoDimensionalArray {
    public static void main(String[] args) {
        ExtraTaskTwoDimensionalArray.createMatrix();
    }

    public static void createMatrix() {
        int[][] arr = new int[8][5];
        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("List " + counter + ": ");
            for (int y = 0; y < arr[i].length; y++) {
                arr[i][y] = (int) (1 + (Math.random() * 999));
                System.out.printf("%5s", arr[i][y] + " ");
            }
            counter++;
            System.out.println();
        }
    }
}
