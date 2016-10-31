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

        switch(num){
            case 1: Scanner scanner = new Scanner(System.in);
                System.out.println("Enter radius: ");
                double radius = scanner.nextDouble();
                CircleArea.calculate(radius); break;
            case 2: Scanner s = new Scanner(System.in);
                System.out.println("Enter first radius");
                double r1 = s.nextDouble();
                System.out.println("Enter second radius");
                double r2 = s.nextDouble();
                double area1 = CircleArea.calculate(r1);
                double area2 = CircleArea.calculate(r2);
                CircleArea.calculateBigger(area1, area2);
                break;
            case 3:Scanner sc = new Scanner(System.in);
                System.out.print("Enter your number:");
                int a = sc.nextInt();
                OddOrEvenNumber.checkIfEven(a);
                break;
            case 4: Scanner scan = new Scanner(System.in);
                System.out.println("Enter sides a and b of triangle: ");
                double b = scan.nextDouble();
                double c = scan.nextDouble();
                RightAngledTriangle.calculateC(b,c);
                break;
            case 5: Scanner s1 = new Scanner(System.in);
                System.out.println("Enter sides a, b and c of triangle: ");
                double d = s1.nextDouble();
                double e = s1.nextDouble();
                double f = s1.nextDouble();
                RightAngledTriangle.checkIfRightAngled(d,e,f);
            default: System.out.println("The program is closing. Goodbye!");
                System.exit(0);
        }
    }
}
