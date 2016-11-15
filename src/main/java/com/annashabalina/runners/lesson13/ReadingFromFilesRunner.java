package com.annashabalina.runners.lesson13;

import com.annashabalina.app.homework.lesson13.CheckForPalindromeFromFile;
import com.annashabalina.app.homework.lesson13.ReadArrayFromFileAndSort;
import com.annashabalina.app.homework.lesson13.SaveInputToUserSelectedFile;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Пользователь on 14.11.2016.
 */
public class ReadingFromFilesRunner {
    public static void main(String[] args) {
        while (true) {
            ReadingFromFilesRunner.displayMenu();
            Scanner s = new Scanner(System.in);
            String programChoice = s.nextLine();
            if (programChoice.equalsIgnoreCase("exit") || programChoice.length() == 0) {
                System.out.println("Program is closing. Goodbye!");
                System.exit(0);
            } else {
                try{
                    int programNum = Integer.parseInt(programChoice);
                    if (programNum > 4 || programNum < 1) {
                        System.out.println("Your number is out of bounds. Try with numbers 1 through 4.");
                    }else {
                        ReadingFromFilesRunner.runProgram(programNum);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Your input is not a number. Please try again.");
                }
            }
        }
    }

    public static void displayMenu() {
        System.out.println("Enter a number to select a program");
        System.out.println("1 - Read array from file -> sort -> write to another file");
        System.out.println("2 - Read words from file -> check if palindrome -> write result to another file");
        System.out.println("3 - Write user's input from console to a file");
        System.out.println("4 - Write properties to a file in key-value format");
        System.out.println("Print \"Exit\" or press Enter to quit");
    }

    public static void runProgram(int programNum) {
        switch (programNum) {
            case 1:
                System.out.println("Select direction of sorting:" + "\n"
                        + "1 - from bigger to smaller" + "\n"
                        + "2 - from smaller to bigger");
                Scanner sortDir = new Scanner(System.in);
                int direction = Integer.parseInt(sortDir.nextLine());
                ReadArrayFromFileAndSort.sortAndPrint(direction);
                break;
            case 2:
                CheckForPalindromeFromFile.palindromeCheck();
                break;
            case 3:
                System.out.println("Chose a name for your file: ");
                Scanner s = new Scanner(System.in);
                String fileName = s.nextLine();
                String pathToFile = SaveInputToUserSelectedFile.createPath(fileName);
                System.out.println("Enter words/phrases to write to file or \"Exit\" to quit");
                try {
                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathToFile)));
                    String userInput = s.nextLine();
                    if (userInput.equalsIgnoreCase("exit")) {
                        System.out.println("Your input has been saved to file");
                        writer.append("bye");
                        writer.close();
                    } else {
                        while (!(userInput.equalsIgnoreCase("exit"))) {
                            writer.append(userInput);
                            writer.newLine();
                            userInput = s.nextLine();
                        }
                        writer.close();
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                break;
            case 4:
                System.out.println("Coming soon...");
                break;
        }
    }
}
