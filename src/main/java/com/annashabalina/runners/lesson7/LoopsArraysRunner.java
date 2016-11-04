package com.annashabalina.runners.lesson7;

import com.annashabalina.app.homework.lesson7.*;
import com.annashabalina.runners.lesson9.ArrayPrint;

import java.util.Scanner;

/**
 * Created by Пользователь on 25.10.2016.
 */
public class LoopsArraysRunner {
    public static void main(String[] args) {
        while(true){
            LoopsArraysRunner.displayMenu();
            Scanner s = new Scanner(System.in);
            String programNum = s.nextLine();
            if(programNum.toLowerCase().equals("exit")){
                System.out.println("The program is stopping. Goodbye!");
                System.exit(0);
            }else{
                try{
                    LoopsArraysRunner.runProgram(Integer.parseInt(programNum));
                }catch (NumberFormatException e){
                    System.out.println("Oops! Looks like you've entered a wrong value. Try again with a value from the menu.");
                }
            }
        }
    }

    public static void displayMenu(){
        System.out.println("Select a program by entering a number or type \"Exit\" to quit this program:");
        System.out.println("1: Print out an array of even numbers from 2 to 20.");
        System.out.println("2: Print out an array of odd numbers from 1 to 99 and then from 99 to 1.");
        System.out.println("3: Print out an array of 15 random numbers from 0 to 9 and find out how many of them are even.");
        System.out.println("4: Print out an array of 15 random numbers from 0 to 999 and find its biggest and smallest values.");
        System.out.println("5: Print out a two-dimensional array of random numbers from 10 to 99.");
        System.out.println("6: Extra task 1: Create two-dimensional array with random numbers and align them to the right.");
        System.out.println("7: Extra task 2: Ask user for input and calculate the sum of all values.");
    }

    public static void runProgram(int num){

        switch(num){
           case 1: int[] myArr = From2To20Array.createEvenNumsArray();
               ArrayPrint.printArraySpaceSeparated(myArr);
               ArrayPrint.printArrayColumn(myArr);
                break;
            case 2: int[] arr= From1To99.createArray();
                ArrayPrint.printArraySpaceSeparated(arr);
                ArrayPrint.printArrayBackwards(arr);
                break;
            case 3: RandomNumbersFrom0To9.createAndPopulate();
                break;
            case 4: From1To999.createAndPopulate();
                break;
            case 5: int[][] twoDimensionalArr = TwoDemensionalArrayOfRandomNums.createAndPopulate(10,99,8,5);
                ArrayPrint.printTwoDimensionalArray(twoDimensionalArr);
                break;
            case 6: ExtraTaskTwoDimensionalArray.createMatrix(1,999);
                break;
            case 7: ExtraTaskSumOfUsersInput.sumUserInput();
                break;
            default: System.out.println("This value is out of bounds. Try again with one of the values from the menu.");
        }
    }
}
