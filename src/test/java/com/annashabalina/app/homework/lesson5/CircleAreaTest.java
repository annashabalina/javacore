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
        double expRes = 314.00 ;
        Assert.assertEquals(expRes, CircleArea.calculate(10), 0.2);
    }
    @Test
    public void calculateAreaWithZeroRadius(){
        double expRes=0;
        Assert.assertEquals(expRes, CircleArea.calculate(0),0.0);
    }
    @Test
    public  void findBigger(){
        int expRes = 1;
        Assert.assertEquals(expRes, CircleArea.calculateBigger(26,10));
    }
}
