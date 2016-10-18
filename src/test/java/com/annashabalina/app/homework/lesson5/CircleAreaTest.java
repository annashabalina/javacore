package com.annashabalina.app.homework.lesson5;

import com.annashabalina.app.classwork.lesson5.CircleArea;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Пользователь on 17.10.2016.
 */
public class CircleAreaTest {
    @Test
    public void calculateArea(){
        double expectedResult = 314.00 ;
        Assert.assertEquals(expectedResult, CircleArea.calculate(10), 0.2);
    }
}
