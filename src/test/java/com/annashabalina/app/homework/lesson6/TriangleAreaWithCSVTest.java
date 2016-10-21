package com.annashabalina.app.homework.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.AbstractCollection;

/**
 * Created by Пользователь on 22.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class TriangleAreaWithCSVTest {
    @Test
    @FileParameters(value="src/test/resources/triangleAreaData.csv",mapper = CsvWithHeaderMapper.class)
    public void calcArea(double base, double height, double expRes){
        Assert.assertEquals(expRes,TriangleArea.calculateArea(base,height), 0.0);
    }
}
