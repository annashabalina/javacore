package com.annashabalina.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Пользователь on 18.10.2016.
 */
public class TaxesThirdTaxGroupTest {
    @Test
    public void runTest(){
        Taxes myTaxes= new Taxes();
        myTaxes.setTaxGroup(3);
        myTaxes.setIncomes(200,200,200);
        double myIncomes = myTaxes.getIncomes();
        int myTaxGr = myTaxes.getTaxGroup();
        double[] myMoney = myTaxes.calculateMoney(myIncomes, myTaxGr);

        double[] expRes = {30,570};

        Assert.assertArrayEquals(expRes, myMoney, 0.0);
    }
}
