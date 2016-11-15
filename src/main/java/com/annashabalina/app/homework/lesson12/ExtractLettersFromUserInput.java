package com.annashabalina.app.homework.lesson12;

import java.util.Scanner;

/**
 * Created by Пользователь on 13.11.2016.
 */
public class ExtractLettersFromUserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("You will be asked to enter a set of characters(letters in any case, digits, special characters) separated by coma." + "\n"
                +"If you are OK with default separator, enter 1" + "\n"
                +"If you want to use your own separator, enter 2");
        String choiceOfSeparator = s.nextLine();
        String separator = "";
        if(choiceOfSeparator.equals("1")){
            separator=",";
        }else{
            System.out.println("Enter your separator");
            separator=s.nextLine();
        }

        System.out.println("Now enter a set of characters separated by what you've chosen");
        String setOfCharacters = s.nextLine();
        String[] splittedInput = setOfCharacters.split(separator);
        for(int i =0; i<splittedInput.length;i++){
            if(splittedInput[i].matches("[a-zA-Z\\s+]*")){
                System.out.print(splittedInput[i]+" ");
            }
        }
    }
}
