package com.annashabalina.app.homework.lesson7;

import java.util.Scanner;

/**
 * Created by Пользователь on 25.10.2016.
 */
public class ExtraTaskSumOfUsersInput {
    static int sum;
    public static void main(String[] args) {
        ExtraTaskSumOfUsersInput.sumUserInput();
    }

    public static void sumUserInput() {
        Scanner s = new Scanner(System.in);
        String askForInput = "Enter a number or \"Exit\": ";
        System.out.println("Enter as many numbers as you wish and press \"Enter\". Type \"Exit\" to calculate their sum.");
        System.out.println(askForInput);
        int sum = 0;
        String input = s.nextLine();
        try {
            while (!input.toLowerCase().equals("exit")) {
                System.out.println(askForInput);
                sum += Integer.parseInt(input);
                input = s.nextLine();
            }
            System.out.print("Total of your input values is " + sum);
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Only numbers and \"Exit\" are allowed. The program will quit now, but before that.." +
                    "The sum of the entered numbers is " + sum);
        }
    }
}
