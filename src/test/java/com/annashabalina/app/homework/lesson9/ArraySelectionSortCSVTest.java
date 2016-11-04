package com.annashabalina.app.homework.lesson9;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.Interceptor;

/**
 * Created by Пользователь on 04.11.2016.
 */
//@RunWith(JUnitParamsRunner.class)
public class ArraySelectionSortCSVTest {
    @Test
    /*@FileParameters(value="src/test/resources/arraySortersData.csv",
                    mapper= CsvWithHeaderMapper.class)
*/
    public void sortFromSmallerToBigger(){
        int[] expRes= {1,3,5};
        Assert.assertArrayEquals(expRes, ArraySelectionSort.fromSmallerToBigger(new int[]{3,5,1}));
    }

    @Test
    public void sortFromBiggerToSmaller(){
        int[] expRes={999,55,23};
        Assert.assertArrayEquals(expRes,ArraySelectionSort.fromBiggerToSmaller(new int[]{55,23,999}));
    }
}
