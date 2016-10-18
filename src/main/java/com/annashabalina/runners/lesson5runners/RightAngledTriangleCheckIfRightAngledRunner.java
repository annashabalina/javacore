package com.annashabalina.runners.lesson5runners;

import com.annashabalina.app.classwork.lesson5.RightAngledTriangle;

import java.util.Scanner;

/**
 * Created by Пользователь on 17.10.2016.
 */
public class RightAngledTriangleCheckIfRightAngledRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a, b and c square: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        RightAngledTriangle.checkIfRightAngled(a,b,c);
    }
}
