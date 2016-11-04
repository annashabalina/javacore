package com.annashabalina.app.classwork.lesson10;

import com.annashabalina.app.classwork.lesson9.CharArray;

/**
 * Created by Пользователь on 02.11.2016.
 */
public class CharArrayToString {
    public static void main(String[] args) {
        char[] myCharArr= {'a','*','c','d'};
        CharArrayToString.convertToString(myCharArr);
    }

    public static String convertToString(char[] arr){
        String str ="";
        for(int i =0;i<arr.length;i++){
            str += arr[i];
        }
        System.out.print(str);
        return str;
    }
}
