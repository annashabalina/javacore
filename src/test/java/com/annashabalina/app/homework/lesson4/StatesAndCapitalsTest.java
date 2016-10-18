package com.annashabalina.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Пользователь on 17.10.2016.
 */
public class StatesAndCapitalsTest {
    @Test
    public void runTest(){
        String expectedResult = "Albany";
        StatesAndCapitals myStatesAndCapitals = new StatesAndCapitals();
        Assert.assertEquals(expectedResult, myStatesAndCapitals.findCapital("New York"));
    }
}
