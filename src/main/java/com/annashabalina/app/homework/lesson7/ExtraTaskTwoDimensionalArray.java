package com.annashabalina.app.homework.lesson7;

/**
 * Created by Пользователь on 25.10.2016.
 */
public class ExtraTaskTwoDimensionalArray {
    public static void main(String[] args) {
        ExtraTaskTwoDimensionalArray.createMatrix(1,999);
    }

    public static void createMatrix(int start, int finish) {
        int[][] arr = new int[8][5];
        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("List " + counter + ": ");
            for (int y = 0; y < arr[i].length; y++) {
                arr[i][y] = (int) (start + (Math.random() * (finish-start+1)));
                System.out.printf("%5s", arr[i][y]);
            }
            counter++;
            System.out.println();
        }
    }
}
