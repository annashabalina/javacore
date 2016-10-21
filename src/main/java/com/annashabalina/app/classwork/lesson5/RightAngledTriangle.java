package com.annashabalina.app.classwork.lesson5;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by Пользователь on 15.10.2016.
 */
public class RightAngledTriangle {

   public static double calculateC(double a, double b){
       if(a==0||b==0){
           System.out.print("A side of a triangle can't be equal to 0.");
           return 0;
       } else {
           double cSquare = Math.pow(a, 2) + Math.pow(b, 2);
           System.out.println("c square equals to " + cSquare);
           return cSquare;
       }
    }


    public static String checkIfRightAngled(double a, double b, double c){
        if(a==0||b==0||c==0){
           String msg = "A side of a triangle can't be equal to 0.";
           System.out.println(msg);
            return msg;
           // return false;
        }
        else if((Math.pow(c,2) == Math.pow(a, 2) + Math.pow(b, 2))||
                (Math.pow(b,2)==Math.pow(a,2)+Math.pow(c,2))||
                Math.pow(a,2)==Math.pow(b,2)+Math.pow(c,2)){
            String msg ="Your Triangle is Right Angled.";
            System.out.println(msg);
            return msg;
        } else{
            String msg = "Your Triangle is not Right Angled.";
            System.out.println(msg);
            return msg;
        }
    }
}

