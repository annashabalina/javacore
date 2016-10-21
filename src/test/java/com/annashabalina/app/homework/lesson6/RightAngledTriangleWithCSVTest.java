package com.annashabalina.app.homework.lesson6;

import com.annashabalina.app.classwork.lesson5.RightAngledTriangle;
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
public class RightAngledTriangleWithCSVTest {
    @Test
    @FileParameters(value = "src/test/resources/rightAngledTriangleData.csv",
                    mapper = CsvWithHeaderMapper.class)
    public void calculateC(double a, double b, double expRes){
        Assert.assertEquals(expRes, RightAngledTriangle.calculateC(a,b), 0.0);
    }

    @Test
    @FileParameters(value="src/test/resources/checkIfRightAngled.csv",
                    mapper= CsvWithHeaderMapper.class)
    public void checkIfRightAngledTest(double a, double b, double c, String expRes){
        Assert.assertEquals(expRes, RightAngledTriangle.checkIfRightAngled(a,b,c));
    }
}
