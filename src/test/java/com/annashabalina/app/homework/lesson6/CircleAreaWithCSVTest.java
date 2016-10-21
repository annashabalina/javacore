package com.annashabalina.app.homework.lesson6;

import com.annashabalina.app.classwork.lesson5.CircleArea;
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
public class CircleAreaWithCSVTest {
    @Test
    @FileParameters(value="src/test/resources/circleAreaData.csv",
            mapper= CsvWithHeaderMapper.class)
    public void calculateCircleArea9(double r, double expRes){
        Assert.assertEquals(expRes, CircleArea.calculate(r),0.2);
    }

    @Test
    @FileParameters(value="src/test/resources/circleAreaCalculateBigger.csv",
                    mapper= CsvWithHeaderMapper.class)
    public void calculateBiggerTest(double r1, double r2, double expRes){
        Assert.assertEquals(expRes, CircleArea.calculateBigger(r1, r2), 0.0);
    }

}
