package com.annashabalina.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Пользователь on 14.10.2016.
 */
public class TaxesFirstTaxGroupTest {
    @Test
     public void taxesTest(){
        Taxes myTaxes = new Taxes();

        myTaxes.setIncomes(100, 100, 100);
        double myIncome=myTaxes.getIncomes();
        //first tax group
        myTaxes.setTaxGroup(1);
        int myTaxGroup=myTaxes.getTaxGroup();
        double result[]= myTaxes.calculateMoney(myIncome, myTaxGroup);

        double expRes[]={30, 270};
        //uncomment to fail the test
       // double expRes[]={120,23};

        Assert.assertArrayEquals(result, expRes, 0.0);
    }

}
