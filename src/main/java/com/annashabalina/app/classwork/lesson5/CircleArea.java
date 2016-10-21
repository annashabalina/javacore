package com.annashabalina.app.classwork.lesson5;

import java.util.Scanner;

/**
 * Created by Пользователь on 15.10.2016.
 */
public class  CircleArea {
    public static double calculate(double radius){
        double circleArea = 3.14159 * Math.pow(radius,2);
        System.out.println("Area is " + circleArea);
        return circleArea;
    }

    public static int calculateBigger(double area1, double area2){
        if(area1>area2){
            System.out.println("Area 1 is bigger");
            return 1;
        } else{
            System.out.println("Area 2 is bigger");
            return 2;
        }
    }
}
