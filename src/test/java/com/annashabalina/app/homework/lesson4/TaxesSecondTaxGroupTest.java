package com.annashabalina.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Пользователь on 18.10.2016.
 */
public class TaxesSecondTaxGroupTest {
    @Test
    public void runTest(){
        Taxes myTaxes = new Taxes();
        myTaxes.setIncomes(200,200,200);
        myTaxes.setTaxGroup(2);

        int myTaxGr = myTaxes.getTaxGroup();
        double myIncomes = myTaxes.getIncomes();
        double[] myMoney = myTaxes.calculateMoney(myIncomes, myTaxGr);
        double[] expectedResult = {120, 480};

        Assert.assertArrayEquals(expectedResult,myMoney, 0.0);
    }
}
