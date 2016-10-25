package com.annashabalina.runners.lesson7;

import com.annashabalina.app.homework.lesson7.*;

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
        if(num==1){
            From2To20Array.printOutArr();
        } else if(num==2){
            From1To99.fillOddArray();
        } else if(num==3){
            RandomNumbersFrom0To9.createAndPopulate();
        } else if(num==4){
            From1To999.createAndPopulate();
        } else if(num==5){
            TwoDemensionalArrayOfRandomNums.createAndPopulate();
        } else if(num==6){
            ExtraTaskTwoDimensionalArray.createMatrix();
        }else if(num==7){
            ExtraTaskSumOfUsersInput.sumUserInput();
        }else{
            System.out.println("This value is out of bounds. Try again with one of the values from the menu.");
        }
    }
}
