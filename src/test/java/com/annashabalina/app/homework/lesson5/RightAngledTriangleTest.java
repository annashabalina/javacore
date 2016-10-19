package com.annashabalina.app.homework.lesson5;

import com.annashabalina.app.classwork.lesson5.RightAngledTriangle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Пользователь on 17.10.2016.
 */
public class RightAngledTriangleTest {
    @Test
    public void calculateCOfTriangle(){
        double expRes =313.0;
        Assert.assertEquals(expRes, RightAngledTriangle.calculateC(12,13), 0.2);
    }
    @Test
    public void CSEqualsASqPlusBSq(){
        boolean expRes = true;
        Assert.assertEquals(expRes, RightAngledTriangle.checkIfRightAngled(3,4,5));
    }
    @Test
    public void BSqEqualsASqPlusCSq(){
        boolean expRes=true;
        Assert.assertEquals(expRes, RightAngledTriangle.checkIfRightAngled(3,5,4));
    }
    @Test
    public void ASqEqualsBSqPlusCSq(){
        boolean expRes = true;
        Assert.assertEquals(expRes, RightAngledTriangle.checkIfRightAngled(5,3,4));
    }
    @Test
    public void checkThatNotRightAngled(){
        boolean expRes = false;
        Assert.assertEquals(expRes, RightAngledTriangle.checkIfRightAngled(2,3,4));
    }
}
