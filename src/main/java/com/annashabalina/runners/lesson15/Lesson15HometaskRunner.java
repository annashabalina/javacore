package com.annashabalina.runners.lesson15;

import com.annashabalina.app.homework.lesson15.*;

import java.util.Scanner;

/**
 * Created by Пользователь on 19.11.2016.
 */
public class Lesson15HometaskRunner {
    public static void main(String[] args) {
        while(true){
        Lesson15HometaskRunner.displayMenu();
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        if (input.length() == 0) {
            System.out.println("Runner is closing. Goodbye!");
            System.exit(0);
        } else {
            try {
                int programNum = Integer.parseInt(input);
                if (programNum > 3 || programNum < 1) {
                    System.out.println("Numbers only from 1 to 3 start a corresponding program. Try again.");
                } else {
                    Lesson15HometaskRunner.runProgram(programNum);
                }
            } catch (NumberFormatException e) {
                System.out.println("Can't parse input to a number. Please try again.");
                Lesson15HometaskRunner.displayMenu();
            }
        }
        }
    }

    public static void displayMenu() {
        System.out.println("Hometask for lesson 15 consists of:" +
                "\n" + "1 - RandomArrayCreator class with 2 overloaded methods." +
                "\n" + "2 - RandomArrayParametrized class" +
                "\n" + "3 - Bicycle and stuff");
    }

    public static void runProgram(int programNum) {
        switch (programNum) {
            case 1:
                Scanner sc = new Scanner(System.in);
                System.out.println("1 - Call createArr method with one parameter;" +
                        "\n" + "2 - Call overloaded createArr method with two parameters.");
                int choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("Set length of the array: ");
                    int length = sc.nextInt();
                    RandomArrayCreator myObj = new RandomArrayCreator();
                    myObj.createArr(length);
                } else {
                    System.out.println("Set length of the outer array: ");
                    int length1 = sc.nextInt();
                    System.out.println("Set length of the inner arrays: ");
                    int length2 = sc.nextInt();
                    RandomArrayCreator myObj = new RandomArrayCreator();
                    myObj.createArr(length1, length2);
                }
                break;
            case 2:
                System.out.println("1 - Use constructor with 1 parameter and call method createArr with 1 parameter" +
                        "\n" + "2 - Use constructor with 2 parameters and call method createArr with 1 parameter" +
                        "\n" + "3 - Use constructor with 1 parameter and call method createArr with 2 parameters" +
                        "\n" + "4 - Use constructor with 2 parameters and call method createArr with 2 parameters" +
                        "\n" + "5 - Quit");

                Scanner scanner = new Scanner(System.in);
                int runCase = scanner.nextInt();
                while (runCase != 5) {
                    switch (runCase) {
                        case 1:
                            RandomArrayParametrized r1 = new RandomArrayParametrized(2);
                            r1.createArr(r1.a);
                            break;
                        case 2:
                            RandomArrayParametrized r2 = new RandomArrayParametrized(2, 3);
                            r2.createArr(r2.b);
                            break;
                        case 3:
                            RandomArrayParametrized r3 = new RandomArrayParametrized(4);
                            r3.createArr(r3.a, 45);
                            break;
                        case 4:
                            RandomArrayParametrized r4 = new RandomArrayParametrized(4, 5);
                            r4.createArr(r4.a, r4.b);
                            break;
                    }
                    runCase = scanner.nextInt();
                }
                break;
            case 3:
                System.out.println("This is all about Bicycles." +
                        "\n" + "1 for CustomBicycle class which extends Bicycle;" +
                        "\n" + "2 for BicycleWithRing class which extends CustomBicycle and implements BicycleWithRingInterface");
                Scanner chooseBycicle = new Scanner(System.in);
                int bikeChoice = chooseBycicle.nextInt();
                if (bikeChoice == 1) {
                    System.out.println("We are about to create an instance of CustomBicycle class");
                    Bicycle myBicycle = new CustomBicycle();
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Set speed(double): ");
                    int speed = scan.nextInt();
                    System.out.println("Set gear(int): ");
                    int gear = scan.nextInt();
                    myBicycle.setSpeed(speed);
                    myBicycle.setGear(gear);
                    myBicycle.ride();
                } else {
                    System.out.println("We are about to create an instance of BicycleWithRing class");
                    BicycleWithRingInterface newRingingBike = new BicycleWithRing();
                    newRingingBike.ring();
                }
                break;
        }
    }
}
