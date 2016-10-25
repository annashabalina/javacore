package com.annashabalina.runners.lesson5;

import com.annashabalina.app.classwork.lesson5.CircleArea;
import com.annashabalina.app.classwork.lesson5.OddOrEvenNumber;
import com.annashabalina.app.classwork.lesson5.RightAngledTriangle;

import java.util.Scanner;

/**
 * Created by Пользователь on 15.10.2016.
 */
public class Lesson5AllProgramsMenuRunner {
    public static void main(String[] args){
        while(true){
            displayMenu();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if(input.length()==0){
                System.out.println("App is closing. Goodbye!");
                System.exit(0);
            }else{
                try{
                    Lesson5AllProgramsMenuRunner.selectYourProgram(Integer.parseInt(input));
                }catch(NumberFormatException e){
                    System.out.println("Looks like your input is not a number. Only numbers can be entered. Thanks you!");
                }

            }
        }

    }

    public static void displayMenu(){
        System.out.println("Select a program or press Enter to quit: ");
        System.out.println("1 - Calculate Area of a Circle");
        System.out.println("2 - Find which of two circle areas is bigger");
        System.out.println("3 - Check if number is Odd or Even");
        System.out.println("4 - Find Csquare of a right-angled triangle");
        System.out.println("5 - Check if your triangle is right-angled");
    }
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
            System.out.println("Enter sides a and b of triangle: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            RightAngledTriangle.calculateC(a,b);
        } else if(num==5){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter sides a, b and c of triangle: ");
            double a = s.nextDouble();
            double b = s.nextDouble();
            double c = s.nextDouble();
            RightAngledTriangle.checkIfRightAngled(a,b,c);
        }else{
            System.exit(0);
        }
    }
}
