package com.annashabalina.runners.lesson5runners;

import com.annashabalina.app.classwork.lesson5.RightAngledTriangle;

import java.util.Scanner;

/**
 * Created by Пользователь on 15.10.2016.
 */
public class RightAngledTriangleCalculateCRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sides and b of triangle: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        RightAngledTriangle.calculateC(a,b);

    }
}
