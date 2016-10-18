package com.annashabalina.runners.lesson5runners;

import com.annashabalina.app.classwork.lesson5.Lesson5AllProgramsMenu;

import java.util.Scanner;

/**
 * Created by Пользователь on 15.10.2016.
 */
public class Lesson5AllProgramsMenuRunner {
    public static void main(String[] args){
        while(true){
            displayMenu();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if(input.length()==0){
                System.out.println("App is closing. Goodbye!");
                System.exit(0);
            }else{
                try{
                    Lesson5AllProgramsMenu.selectYourProgram(Integer.parseInt(input));
                }catch(NumberFormatException e){
                    System.out.println("Looks like your input is not a number. Only numbers can be entered. Thanks you!");
                }

            }
        }

    }

    public static void displayMenu(){
        System.out.println("Select a program or press Enter to quit: ");
        System.out.println("1 - Calculate Area of a Circle");
        System.out.println("2 - Find which of two circle areas is bigger");
        System.out.println("3 - Check if number is Odd or Even");
        System.out.println("4 - Find Csquare of a right-angled triangle");
        System.out.println("5 - Check if your triangle is right-angled");
    }
}
