package com.annashabalina.runners.lesson5runners;

import com.annashabalina.app.classwork.lesson5.OddOrEvenNumber;

import java.util.Scanner;

/**
 * Created by Пользователь on 15.10.2016.
 */
public class OddOrEvenNumberRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number:");
        int a = scanner.nextInt();
        OddOrEvenNumber.checkIfEven(a);
    }
}
