package com.annashabalina.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Пользователь on 14.10.2016.
 */
public class TaxesTest {
    @Test
     public void testFirstGroup(){
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

    @Test
    public void testSecondGroup(){
        Taxes myTaxes = new Taxes();
        myTaxes.setIncomes(200,200,200);
        myTaxes.setTaxGroup(2);

        int myTaxGr = myTaxes.getTaxGroup();
        double myIncomes = myTaxes.getIncomes();
        double[] myMoney = myTaxes.calculateMoney(myIncomes, myTaxGr);
        double[] expectedResult = {120, 480};

        Assert.assertArrayEquals(expectedResult,myMoney, 0.0);
    }

    @Test
    public void testThirdGroup(){
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
