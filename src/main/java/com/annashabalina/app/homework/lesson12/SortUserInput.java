package com.annashabalina.app.homework.lesson12;

import com.annashabalina.app.homework.lesson9.ArraySelectionSort;
import com.annashabalina.runners.lesson9.ArrayPrint;

import java.util.Scanner;

/**
 * Created by Пользователь on 13.11.2016.
 */
public class SortUserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("You will be asked to enter your numbers separated by comma." + "\n"
                + "Enter 1 if you are OK with default separator." + "\n"
                + "Enter 2 if you would like to change a separator. BUT! Don't use dots as separators. Your separator can be 1 symbol only!");
        String indexOfSeparator = s.nextLine();
        String separator = "";
        if (indexOfSeparator.equals("1")) {
            separator = ",";
        } else {
            while (separator == "") {
                System.out.println("Enter you separator. It can be only 1 symbol:");
                String tempSeparator = s.nextLine();
                if (tempSeparator.equals(".")) {
                    System.out.println("Dots are not allowed as separators. Try another symbol.");
                } else if (tempSeparator.length() > 1) {
                    System.out.println("Do not use more then 1 symbol.");
                } else if (tempSeparator.equals(".") && tempSeparator.length() > 1) {
                    System.out.println("Do not use dot as separator. Do not use more then 1 symbol as separator.");
                } else {
                    separator = tempSeparator;
                }
            }
        }

        System.out.println("Enter your numbers:");
        String inputNums = s.nextLine();
        String[] inputStrArr = inputNums.split(separator);
        int[] inputIntArr = new int[inputStrArr.length];
        for (int i = 0; i < inputStrArr.length; i++) {
            inputIntArr[i] = Integer.parseInt(inputStrArr[i]);
        }

        System.out.println("Choose how you want them sorted: " + "\n"
                + "1 - From smaller to bigger; " + "\n"
                + "2 - From bigger to smaller");
        String sortDirection = s.nextLine();
        if (sortDirection.equals("1")) {
            ArraySelectionSort.fromSmallerToBigger(inputIntArr);
            ArrayPrint.printArray("Here is your array sorted from smaller to bigger: ", inputIntArr);
        } else {
            ArraySelectionSort.fromBiggerToSmaller(inputIntArr);
            ArrayPrint.printArray("Here is your array sorted from bigger to smaller: ", inputIntArr);
        }
    }

    public static void userSeparator(String sep){

    }
}

