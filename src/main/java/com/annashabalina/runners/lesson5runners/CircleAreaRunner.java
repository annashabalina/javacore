package com.annashabalina.runners.lesson5runners;

import com.annashabalina.app.classwork.lesson5.CircleArea;

import java.util.Scanner;

/**
 * Created by Пользователь on 15.10.2016.
 */
public class CircleAreaRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

         CircleArea.calculate(radius);
    }
}
