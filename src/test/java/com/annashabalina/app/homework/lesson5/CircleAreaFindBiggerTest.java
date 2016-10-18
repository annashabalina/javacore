package com.annashabalina.app.homework.lesson5;

import com.annashabalina.app.classwork.lesson5.CircleArea;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Пользователь on 17.10.2016.
 */
public class CircleAreaFindBiggerTest {
    @Test
    public  void runTest(){
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, CircleArea.calculateBigger(26,10));
    }
}
