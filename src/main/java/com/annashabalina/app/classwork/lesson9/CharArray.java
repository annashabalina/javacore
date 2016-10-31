package com.annashabalina.app.classwork.lesson9;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Пользователь on 29.10.2016.
 */
public class CharArray {
    public static void main(String[] args) {
        char[] arr = new char[256];
        for(int i=0; i<arr.length;i++){
            arr[i] = (char) i;
        }
        System.out.print("Char array:\n" + Arrays.toString(arr));
    }
}
