package com.annashabalina.app.homework.lesson7;

/**
 * Created by Пользователь on 24.10.2016.
 */
public class From2To20Array {
    public static void printOutArr() {
        int[] evenNums = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = 0; i < evenNums.length; i++) {
            System.out.print(evenNums[i] + " ");
        }

        System.out.println();

        for (int y = 0; y < evenNums.length; y++) {
            System.out.println(evenNums[y]);
        }
    }
}
