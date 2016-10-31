package com.annashabalina.app.homework.lesson7;

/**
 * Created by Пользователь on 25.10.2016.
 */
public class TwoDemensionalArrayOfRandomNums {
    public static int[][] createAndPopulate(int start, int finish) {
        int[][] arr = new int[8][5];
        for(int i =0; i<arr.length;i++){
            for(int y=0; y<arr[i].length;y++){
                arr[i][y]= start+ (int)(Math.random()*(finish-start+1));
            }
        }
        return arr;
    }
}
