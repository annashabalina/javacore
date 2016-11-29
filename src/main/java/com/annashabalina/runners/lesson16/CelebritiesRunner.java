package com.annashabalina.runners.lesson16;

import com.annashabalina.app.homework.lesson16.Celebrities;

import java.util.Scanner;

/**
 * Created by Пользователь on 27.11.2016.
 */
public class CelebritiesRunner {
    public static void main(String[] args) {
        String currStar="";
        String nextStar="";
        String inputAge;
        String inputLifeStatus="";
        int guessed=0;
        int totalTries=0;
        int index = 0;
        Celebrities[] c = Celebrities.values();

        Scanner s = new Scanner(System.in);
        
        while(guessed<3 && totalTries<5){
            totalTries++;
            if(nextStar.equals(currStar)){
                index = (int)(Math.random()*c.length);
                nextStar=c[index].getFullName();
                System.out.println("How old is " + nextStar+"?");
                inputAge=s.nextLine();
                if(Integer.parseInt(inputAge)==c[index].getAge()){
                    System.out.println("Is this star dead or alive?");
                    inputLifeStatus=s.nextLine();
                    if(inputLifeStatus.equalsIgnoreCase(c[index].getLifeStatus())){
                        System.out.println("Way to go!!");
                        guessed++;
                    }
                }else{
                    System.out.println("Wrong! This star is "+ c[index].getAge());
                }
            }
            currStar=nextStar;
        }

        if(guessed==3){
            System.out.println("Congratulations!! You won!!");
        }else{
            System.out.println("You ran out of attempts. Better luck next time.");
        }
        //System.out.println(c[index].getAge() + " " + c[index].getFullName());
    }
}
