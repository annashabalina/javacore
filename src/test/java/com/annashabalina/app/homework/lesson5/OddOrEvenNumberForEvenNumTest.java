package com.annashabalina.app.homework.lesson5;

import com.annashabalina.app.classwork.lesson5.OddOrEvenNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Пользователь on 17.10.2016.
 */
public class OddOrEvenNumberForEvenNumTest {
    @Test
    public void runTest() {
        String expectedResult = "Number is even";
        Assert.assertEquals(expectedResult, OddOrEvenNumber.checkIfEven(40));
    }
}
