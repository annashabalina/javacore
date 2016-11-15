package com.annashabalina.runners.lesson12;

import com.annashabalina.app.homework.lesson12.CaesarCipher;
import com.annashabalina.app.homework.lesson12.Enigma;
import com.annashabalina.app.homework.lesson12.SortUserInput;
import com.annashabalina.app.homework.lesson9.ArraySelectionSort;
import com.annashabalina.runners.lesson9.ArrayPrint;

import java.util.Scanner;

/**
 * Created by Пользователь on 13.11.2016.
 */
public class HometaskLesson12Runner {
    public static void main(String[] args) {
        while (true) {
            HometaskLesson12Runner.displayMenu();
            Scanner s = new Scanner(System.in);
            String programNum = s.nextLine();
            if(programNum.equalsIgnoreCase("exit")||programNum.length()==0){
                System.out.println("Program is stopping. Goodbye!");
                System.exit(0);
            }else {
                try {
                    HometaskLesson12Runner.runProgram(Integer.parseInt(programNum));
                } catch (NumberFormatException e) {
                    System.out.println("Your input is not a number. Please try again");
                    displayMenu();
                }
            }
        }
    }

    private static void displayMenu() {
        System.out.println("This hometask consists of:" +
                "\n" + "1: Ask user to enter numbers and to change separator. Then sort the input in the direction selected by the user." +
                "\n" + "2: Extract only letters in any case from user's input" +
                "\n" + "3: Split user's input by a keyword" +
                "\n" + "4: Encode or decode input with the help of Enigma" +
                "\n" + "5: Caesar's cipher" +
                "\n" + "or Enter \"Exit\" or press Enter to quit");
    }

    private static void runProgram(int programNum) {
        Scanner s = new Scanner(System.in);
        String userPhrase;
        int methodChoice;
        switch (programNum) {
            case 1:
                Scanner s1 = new Scanner(System.in);
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
                break;
            case 2:
                Scanner s2 = new Scanner(System.in);
                System.out.println("You will be asked to enter a set of characters(letters in any case, digits, special characters) separated by coma." + "\n"
                        + "If you are OK with default separator, enter 1" + "\n"
                        + "If you want to use your own separator, enter 2");
                String choiceOfSeparator = s.nextLine();
                String separator2 = "";
                if (choiceOfSeparator.equals("1")) {
                    separator2 = ",";
                } else {
                    System.out.println("Enter your separator");
                    separator2 = s.nextLine();
                }

                System.out.println("Now enter a set of characters separated by what you've chosen");
                String setOfCharacters = s.nextLine();
                String[] splittedInput = setOfCharacters.split(separator2);
                for (int i = 0; i < splittedInput.length; i++) {
                    if (splittedInput[i].matches("[a-zA-Z\\s+]*")) {
                        System.out.println(splittedInput[i] + " ");
                    }
                }
                break;
            case 3:
                Scanner s3 = new Scanner(System.in);
                System.out.println("Enter a phrase: ");
                String phrase = s3.nextLine().toLowerCase();
                System.out.println("Enter a keyword: ");
                String keyword = s3.nextLine().toLowerCase();

                if (phrase.indexOf(keyword) == 0) {
                    System.out.println(phrase);
                } else {
                    String[] arr = phrase.split(keyword);
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i].trim());
                    }
                }
                break;
            case 4:
                System.out.println("Enter 1 to encode or 2 to decode a phrase");
                methodChoice = Integer.parseInt(s.nextLine());
                System.out.println("Enter your phrase: ");
                String input = s.nextLine();
                if (methodChoice == 1) {
                    Enigma.encode(input);
                } else {
                    Enigma.decode(input);
                }
                break;
            case 5:
                System.out.println("Enter 1 to encode a phrase or 2 to decode it");
                methodChoice = Integer.parseInt(s.nextLine());
                System.out.println("Enter your phrase: ");
                userPhrase = s.nextLine();
                System.out.println("How many to shift");
                int shift = s.nextInt();
                if (methodChoice == 1) {
                    CaesarCipher.encode(userPhrase, shift);
                } else {
                    CaesarCipher.decode(userPhrase, shift);
                }
                break;
        }
    }
}
