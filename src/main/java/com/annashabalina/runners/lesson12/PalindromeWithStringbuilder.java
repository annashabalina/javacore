package com.annashabalina.runners.lesson12;

/**
 * Created by Пользователь on 09.11.2016.
 */
public class PalindromeWithStringbuilder {
    public static void main(String[] args) {
        StringBuilder b1 = new StringBuilder("world");
        String b2 = b1.reverse().toString();

        if(b1.equals(b2)){
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
