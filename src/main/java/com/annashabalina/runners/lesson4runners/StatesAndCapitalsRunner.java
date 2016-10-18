package com.annashabalina.runners.lesson4runners;

import com.annashabalina.app.homework.lesson4.StatesAndCapitals;

import java.util.Scanner;

/**
 * Created by Пользователь on 16.10.2016.
 */
public class StatesAndCapitalsRunner {
    public static void main(String[] args) {
        StatesAndCapitals myObj = new StatesAndCapitals();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Capital of what state do you want to find?");
        String state = scanner.next();
        myObj.findCapital(state);
    }
}
