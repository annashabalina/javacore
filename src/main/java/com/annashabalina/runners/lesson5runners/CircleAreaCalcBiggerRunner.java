package com.annashabalina.runners.lesson5runners;

import com.annashabalina.app.classwork.lesson5.CircleArea;

import java.util.Scanner;

/**
 * Created by Пользователь on 17.10.2016.
 */
public class CircleAreaCalcBiggerRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first radius");
        double r1 = s.nextDouble();

        System.out.println("Enter second radius");
        double r2 = s.nextDouble();

        double area1 = CircleArea.calculate(r1);
        double area2 = CircleArea.calculate(r2);
        CircleArea.calculateBigger(area1, area2);
    }
}
