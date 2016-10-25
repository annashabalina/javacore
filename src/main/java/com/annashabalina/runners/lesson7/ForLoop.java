package com.annashabalina.runners.lesson7;

/**
 * Created by Пользователь on 22.10.2016.
 */
public class ForLoop {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.print("i = " + i +"; ");
        }

       // ForLoop myCountOfEven = new ForLoop();
       // myCountOfEven.countEvenNums();

        //ForLoop myIntArray = new ForLoop();
        //myIntArray.printIntArray();

        ForLoop myCharArray = new ForLoop();
        myCharArray.printCharArray();
    }

    public void countEvenNums(){
        int counter=0;
        for(int i=0;i<=20;i++){
            if(i%2==0){
                counter++;
            }
        }
        System.out.println(counter);
    }

    public void printIntArray(){
        int[] intArray={1,2,3};
        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }

    public void printCharArray(){
        char[] charArray={'a','*', '?'};
        for(int i =0;i<charArray.length;i++){
            System.out.println(charArray[i]);
        }
    }
}
