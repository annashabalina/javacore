package com.annashabalina.app.classwork.lesson5;
import java.util.Scanner;

/**
 * Created by Пользователь on 15.10.2016.
 */
public class OddOrEvenNumber {
     public static String checkIfEven(int num){

        if(num ==0){
            System.out.println("0 is even");
            return "0 is even";
        }
        else if(num%2==0){
            System.out.println("Number is even");
            return "Number is even";
        }else{
            System.out.println("Number is odd");
            return "Number is odd";
        }
    }
}
