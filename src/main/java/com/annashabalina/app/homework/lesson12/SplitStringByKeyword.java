package com.annashabalina.app.homework.lesson12;

import java.util.Scanner;

/**
 * Created by Пользователь on 13.11.2016.
 */
public class SplitStringByKeyword {
    public static void main(String[] args) {
        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String phrase = s3.nextLine().toLowerCase();
        System.out.println("Enter a keyword: ");
        String keyword = s3.nextLine().toLowerCase();

        if (phrase.indexOf(keyword) == 0) {
            System.out.println(phrase);
        } else {
            String[] arr = phrase.split(keyword);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i].trim());
            }
        }
    }
}
