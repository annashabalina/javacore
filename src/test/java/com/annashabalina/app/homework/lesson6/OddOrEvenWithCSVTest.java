package com.annashabalina.app.homework.lesson6;

import com.annashabalina.app.classwork.lesson5.OddOrEvenNumber;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Пользователь on 21.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class OddOrEvenWithCSVTest {
    @Test
    @FileParameters(value="src/test/resources/oddOrEvenData.csv",
                    mapper = CsvWithHeaderMapper.class)
    public void oddOrEven(int num, String expRes){
        Assert.assertEquals(expRes, OddOrEvenNumber.checkIfEven(num));
    }
}
