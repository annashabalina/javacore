package com.annashabalina.runners.lesson7;

import java.util.Scanner;

/**
 * Created by Пользователь on 22.10.2016.
 */
public class WhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers to compare: ");
        int a = s.nextInt();
        int b = s.nextInt();

        WhileLoop myNums = new WhileLoop();
        myNums.compareNums(a, b);
    }

    public void compareNums(int a, int b) {
        while (a > b) {
                System.out.println("first number is " + a + ", second number is " + b);
                a--;
        }
        System.out.println("first number is " + a+ ", second number is" + b);
        }
    }


