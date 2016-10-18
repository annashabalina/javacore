package com.annashabalina.app.classwork.lesson5;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by Пользователь on 15.10.2016.
 */
public class RightAngledTriangle {

   public static double calculateC(double a, double b){
     double cSquare = Math.pow(a,2)+Math.pow(b,2);
        System.out.println("c square equals to " + cSquare);
        return cSquare;
    }


    public static double checkIfRightAngled(double a, double b, double c){

        if(c == Math.pow(a, 2) + Math.pow(b, 2)){
            System.out.println("Your Triangle is Right Angled");
            return c;
        } else{
            System.out.println("Your Triangle is not Right Angled");
            return 0;
        }
    }
}

