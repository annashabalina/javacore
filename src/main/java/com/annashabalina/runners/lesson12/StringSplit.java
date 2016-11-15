package com.annashabalina.runners.lesson12;

import java.util.Scanner;

/**
 * Created by Пользователь on 09.11.2016.
 */
public class StringSplit {
    public static void main(String[] args) {
        System.out.println("Enter a phrase to count words:");
        Scanner s = new Scanner(System.in);
        String input= s.nextLine();
        String formated = input.replaceAll("\\s+", " ").trim();
        String[] arr = formated.split(" ");
        System.out.print("there are " +arr.length+ " words in the input");
    }
}
