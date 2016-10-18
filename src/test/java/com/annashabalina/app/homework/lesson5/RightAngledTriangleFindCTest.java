package com.annashabalina.app.homework.lesson5;

import com.annashabalina.app.classwork.lesson5.RightAngledTriangle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Пользователь on 17.10.2016.
 */
public class RightAngledTriangleFindCTest {
    @Test
    public void runTest(){
        double expectedResult =313.0;
        Assert.assertEquals(expectedResult, RightAngledTriangle.calculateC(12,13), 0.2);
    }
}
