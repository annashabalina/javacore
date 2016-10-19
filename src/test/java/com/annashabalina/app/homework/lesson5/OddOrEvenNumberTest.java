package com.annashabalina.app.homework.lesson5;

import com.annashabalina.app.classwork.lesson5.OddOrEvenNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Пользователь on 17.10.2016.
 */
public class OddOrEvenNumberTest {
    @Test
    public void runForEvenNumber() {
        String expectedResult = "Number is even";
        Assert.assertEquals(expectedResult, OddOrEvenNumber.checkIfEven(40));
    }
    @Test
    public void runForOddNumber(){
        String expectedResult = "Number is odd";
        Assert.assertEquals(expectedResult, OddOrEvenNumber.checkIfEven(7));
    }

    @Test
    public void runWithZero(){
        String expectedResult = "0 is neither odd nor even";
        Assert.assertEquals(expectedResult, OddOrEvenNumber.checkIfEven(0));
    }
}
