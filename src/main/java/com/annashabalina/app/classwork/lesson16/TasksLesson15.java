package com.annashabalina.app.classwork.lesson16;

import com.annashabalina.app.homework.lesson15.BicycleWithRing;
import com.annashabalina.app.homework.lesson15.BicycleWithRingInterface;
import com.annashabalina.app.homework.lesson15.RandomArrayCreator;
import com.annashabalina.app.homework.lesson15.RandomArrayParametrized;
import com.annashabalina.runners.lesson15.Lesson15HometaskRunner;

import java.util.Scanner;

/**
 * Created by Пользователь on 26.11.2016.
 */
public enum TasksLesson15 {
    A, B, C;

    public static void main(String[] args) {
        Lesson15HometaskRunner.displayMenu();
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        try {
            TasksLesson15 t = TasksLesson15.valueOf(input.toUpperCase());
            switch (t) {
                case A:
                    RandomArrayCreator myObj = new RandomArrayCreator();
                    myObj.createArr(8);
                    break;
                case B:
                    RandomArrayParametrized r1 = new RandomArrayParametrized(12);
                    r1.createArr(r1.a);
                    break;
                case C:
                    BicycleWithRingInterface newRingingBike = new BicycleWithRing();
                    newRingingBike.ring();
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("wrong value");
        }
    }
}
