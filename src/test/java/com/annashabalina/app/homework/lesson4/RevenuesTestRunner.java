package com.annashabalina.app.homework.lesson4;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


/**
 * Created by Пользователь on 14.10.2016.
 */
public class RevenuesTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(RevenuesTest.class);
        for(Failure failure:result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
