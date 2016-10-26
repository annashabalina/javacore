package com.annashabalina.app.homework.lesson7;

/**
 * Created by Пользователь on 25.10.2016.
 */
public class TwoDemensionalArrayOfRandomNums {
    public static void createAndPopulate() {
        int[][] arr = new int[8][5];
        for(int i =0; i<arr.length;i++){
            for(int y=0; y<arr[i].length;y++){
                arr[i][y]=10+ (int)(Math.random()*90);
                System.out.print(arr[i][y]);
            }
            System.out.println();
        }
    }
}
