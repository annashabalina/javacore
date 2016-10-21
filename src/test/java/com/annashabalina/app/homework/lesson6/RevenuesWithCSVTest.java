package com.annashabalina.app.homework.lesson6;

import com.annashabalina.app.homework.lesson4.Revenues;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Пользователь on 21.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class RevenuesWithCSVTest {
    Revenues myRevenues = new Revenues();
    @Test
    @FileParameters(value="src/test/resources/revenuesData.csv",
                    mapper = CsvWithHeaderMapper.class)
    public void calcRevenues(int items, double price, double income){
        myRevenues.setNumberOfItemsSold(items);
        myRevenues.setPricePerItem(price);
        double myIncome = myRevenues.getNumberOfItemsSold()*myRevenues.getPricePerItem();
        Assert.assertEquals(income, myIncome, 0.0);
    }
}
