package com.annashabalina.app.classwork.lesson5;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Пользователь on 15.10.2016.
 */
public class Lesson5AllProgramsMenu {
    public static void selectYourProgram(int num){
        if(num==1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter radius: ");
            double radius = scanner.nextDouble();
            CircleArea.calculate(radius);
        }else if(num==2){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter first radius");
            double r1 = s.nextDouble();

            System.out.println("Enter second radius");
            double r2 = s.nextDouble();

            double area1 = CircleArea.calculate(r1);
            double area2 = CircleArea.calculate(r2);
            CircleArea.calculateBigger(area1, area2);
        } else if(num==3){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your number:");
            int a = scanner.nextInt();
            OddOrEvenNumber.checkIfEven(a);
        } else if(num==4){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter sides and b of triangle: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            RightAngledTriangle.calculateC(a,b);
        } else if(num==5){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a, b and c square: ");
            double a = s.nextDouble();
            double b = s.nextDouble();
            double c = s.nextDouble();
            RightAngledTriangle.checkIfRightAngled(a,b,c);
        }else{
            System.out.println("No such program. Try again with numbers between 1 and 5.");
        }
    }
}
