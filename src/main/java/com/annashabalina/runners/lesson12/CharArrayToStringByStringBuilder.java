package com.annashabalina.runners.lesson12;

import java.util.Scanner;

/**
 * Created by Пользователь on 09.11.2016.
 */
public class CharArrayToStringByStringBuilder {
    public static void main(String[] args) {
        char[] arr ={'a','b','c'};
        StringBuilder sb=new StringBuilder("");

        for(int i =0; i<arr.length;i++) {
            sb.append(arr[i]);
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
