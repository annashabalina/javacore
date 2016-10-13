package com.annashabalina.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Пользователь on 12.10.2016.
 */
public class MathFuncTest {
    @Test //JUnit framework annotation
    public void multiplyTest(){
        int a =1, b=2, expRes=2;
        MathFunc myMath = new MathFunc();
        //myMath.multiply(a,b);
        Assert.assertEquals(expRes, myMath.multiply(a,b));
    }
}
