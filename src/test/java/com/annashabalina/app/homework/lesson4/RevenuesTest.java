package com.annashabalina.app.homework.lesson4;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Пользователь on 14.10.2016.
 */
public class RevenuesTest {
    @Test
    public void revenuesTest(){
        Revenues myRevenues = new Revenues();

        myRevenues.setNumberOfItemsSold(18);
        int items = myRevenues.getNumberOfItemsSold();

        myRevenues.setPricePerItem(3.54);
        double pricePerItem = myRevenues.getPricePerItem();

        double income = items*pricePerItem;
        double expectedResult = 63.72;
        //double expectedResult = 63.7;
        Assert.assertEquals(expectedResult, income, 0.0);
    }
}
