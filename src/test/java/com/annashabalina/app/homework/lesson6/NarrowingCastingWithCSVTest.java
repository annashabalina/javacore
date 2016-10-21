package com.annashabalina.app.homework.lesson6;

import com.annashabalina.app.utils.PrimitiveConvertor;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Пользователь on 21.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class NarrowingCastingWithCSVTest {
    @Test
    @FileParameters(value="src/test/resources/floatToCharData.csv",
                    mapper = CsvWithHeaderMapper.class)
    public void convertFloatToChar(float a, char expRes){
        PrimitiveConvertor myConvertor=new PrimitiveConvertor();
        Assert.assertEquals(expRes, myConvertor.floatToChar(a));
    }

    @Test
    @FileParameters(value="src/test/resources/intToCharData.csv", mapper = CsvWithHeaderMapper.class)
    public void convertIntToChar(int a, char expRes){
        PrimitiveConvertor myConvertor=new PrimitiveConvertor();
        Assert.assertEquals(expRes,myConvertor.intToChar(a));
    }

    @Test
    @FileParameters(value="src/test/resources/charToIntData.csv", mapper = CsvWithHeaderMapper.class)
    public void convertChatToInt(char a, int expRes){
        PrimitiveConvertor myConvertor = new PrimitiveConvertor();
        Assert.assertEquals(expRes, myConvertor.charToInt(a));
    }
}
