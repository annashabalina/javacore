package com.annashabalina.app.homework.lesson4;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Пользователь on 14.10.2016.
 */
public class MessageTestRunner {
    public static void main(String[] args) {
        Result myResult = JUnitCore.runClasses(MessageTest.class);
        for(Failure failure: myResult.getFailures()){
            System.out.println(failure.toString());
        }

        System.out.print(myResult.wasSuccessful());
    }
}
