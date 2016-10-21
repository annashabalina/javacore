package com.annashabalina.app.homework.lesson6;

import com.annashabalina.app.homework.lesson4.Taxes;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Пользователь on 22.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
@Ignore
public class TaxesWithCSVTest {
    Taxes myTaxObj;
    @Before
    public void setObjValue(){
        myTaxObj = new Taxes();
    }

    @After
    public void releaseTaxObj(){
        myTaxObj=null;
    }

    @Test
    @FileParameters(value="", mapper= CsvWithHeaderMapper.class)
    public void calcTaxes(double m1, double m2, double m3, int group, double[] expRes){

    }
}
