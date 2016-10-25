package com.annashabalina.runners.lesson7;

/**
 * Created by Пользователь on 22.10.2016.
 */
public class PreAndPostIncrement {
    public static void main(String[] args) {
        int a =1;
        System.out.println("Original value of a is " + a);
        System.out.println("Post-increment value of a is "+ a++);
        System.out.println("After post-increment, value of a is " + a);
        System.out.println("Pre-increment a "+ ++a);
        System.out.println("After pre-increment, value of a is " + a);
    }
}
