package com.annashabalina.runners.lesson10;

import com.annashabalina.app.classwork.lesson10.Palindromes;

import java.util.Scanner;

/**
 * Created by Пользователь on 04.11.2016.
 */
public class PalindromesRunner {
    public static void main(String[] args) {
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your word or a phrase or ENTER to quit.");
            String checkForPalindrome = s.nextLine();
            if(checkForPalindrome.length()==0){
                System.out.println("The program is stopping. Goodbye!");
                System.exit(0);
            }else{
                PalindromesRunner.displayMenu();
                String progNum = s.nextLine();

                if (progNum.length() == 0) {
                    System.out.println("The program is stopping. Goodbye!");
                    System.exit(0);
                } else {
                    try {
                        PalindromesRunner.runProgram(Integer.parseInt(progNum), checkForPalindrome);
                    } catch (NumberFormatException e) {
                        System.out.println("Something went wrong. Try again with numbers 1 through 5.");
                    }
                }
            }
        }
    }

    public static void displayMenu() {
        System.out.println("There are algorithms to determine whether a string is palindrome or not. Type in a number to run one of them or press" +
                " ENTER to quit.");
        System.out.println("1 - Check for palindrome v1: compare symbol by symbol.");
        System.out.println("2 - Check for palindrome v2: reverse a string and compare with the original.");
        System.out.println("3 - Check for palindrome v3: split the string in 2 parts and compare them.");
        System.out.println("4 - Check for palindrome v4: compare symbol by symbol(starting from the middle of the string)");
        System.out.println("5 - Check for palindrome v5: split the string in 2 parts and compare them(starting from the middle of the string)");
    }

    public static void runProgram(int num, String s) {
        switch (num) {
            case 1:
                Palindromes.checkIfPalindromeV1(s);
                break;
            case 2:
                Palindromes.checkIfPalindromeV2(s);
                break;
            case 3:
                Palindromes.checkIfPalindromeV3(s);
                break;
            case 4:
                Palindromes.checkIfPalindromeV4(s);
                break;
            case 5:
                Palindromes.checkIfPalindromeV5(s);
                break;
        }
    }
}
