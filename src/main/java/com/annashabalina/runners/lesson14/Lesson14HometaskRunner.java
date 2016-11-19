package com.annashabalina.runners.lesson14;

import com.annashabalina.app.homework.lesson14.WhiteCollar;
import com.annashabalina.app.homework.lesson14.Human;

import java.util.Scanner;

/**
 * Created by Пользователь on 18.11.2016.
 */
public class Lesson14HometaskRunner {
    public static void main(String[] args) {
        while(true) {
            Lesson14HometaskRunner.displayMenu();
            Scanner s = new Scanner(System.in);
            String userChoice = s.nextLine();
            if (userChoice.length() == 0) {
                System.out.print("Runner is stopping. Bye!");
                System.exit(0);
            } else {
                try {
                    int programNum = Integer.parseInt(userChoice);
                    if (programNum > 2 || programNum < 0) {
                        System.out.println("Try with numbers 1 or 2.");
                    } else {
                        Lesson14HometaskRunner.runProgram(programNum);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Your input can't be converted to a number.");
                    Lesson14HometaskRunner.displayMenu();
                }
            }
        }
    }

    public static void displayMenu() {
        System.out.println("Hometask of lesson 14 consists of:" +
                "\n" + "1 - Create an instance of class Human;" +
                "\n" + "2 - Create an instance of class WhiteCollar which extends class Human." +
                "\n" + "Enter a number to call constructors or press \"Enter\" to quit.");
    }

    public static void runProgram(int programNum){
        switch(programNum){
            case 1:
                Scanner humanScanner = new Scanner(System.in);
                System.out.println("We will now create an instance of class Human." +
                        "\n"+"First, let's select a name for this new Human:");
                String name = humanScanner.nextLine();
                System.out.println("Now let's define the age:");
                int age = humanScanner.nextInt();
                Human newHuman = new Human(name, age);
                newHuman.meetHuman();
                break;
            case 2:
                Scanner whiteCollarScanner = new Scanner(System.in);
                System.out.println("We will now create an instance of class WhiteCollar." +
                        "\n"+"First, let's define a name:");
                String whiteCollarName = whiteCollarScanner.nextLine();
                System.out.println("Now let's define the age:");
                int whiteCollarAge = whiteCollarScanner.nextInt();
                System.out.println("Now a company:");
                Scanner company = new Scanner(System.in);
                String compName = company.nextLine();
                WhiteCollar newEmployee = new WhiteCollar(whiteCollarName,whiteCollarAge,compName);
                newEmployee.meetWhiteCollar();
                break;
        }
    }
}
