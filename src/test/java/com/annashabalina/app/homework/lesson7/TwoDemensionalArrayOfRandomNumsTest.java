package com.annashabalina.app.homework.lesson7;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Пользователь on 02.11.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class TwoDemensionalArrayOfRandomNumsTest {
    @Test
    @FileParameters(value="src/test/resources/TwoDemensionalFromLesson7.csv",
                    mapper= CsvWithHeaderMapper.class)
    public void checkMaxBoundary(int startIndex, int endIndex, int firstArrSize, int secondArrSize, int expRes){
        int flag=0;
        int[][] testArr =TwoDemensionalArrayOfRandomNums.createAndPopulate(startIndex,endIndex,firstArrSize,secondArrSize);
        for(int i=0;i<testArr.length;i++){
            for(int y =0;y<testArr[i].length;y++){
                if(testArr[i][y]>endIndex){
                    flag=1;
                }
            }
        }
        Assert.assertEquals(expRes,flag);
    }

    @Test
    @FileParameters(value="src/test/resources/TwoDemensionalFromLesson7.csv",
            mapper= CsvWithHeaderMapper.class)
    public void checkMinBoundary(int startIndex, int endIndex, int firstArrSize, int secondArrSize, int expRes){
        int flag=0;
        int[][] testArr =TwoDemensionalArrayOfRandomNums.createAndPopulate(startIndex,endIndex,firstArrSize,secondArrSize);
        for(int i=0;i<testArr.length;i++){
            for(int y =0;y<testArr[i].length;y++){
                if(testArr[i][y]<startIndex){
                    flag=1;
                }
            }
        }
        Assert.assertEquals(expRes,flag);
    }

    @Test
    @FileParameters(value="src/test/resources/TwoDemensionalFromLesson7.csv",
            mapper= CsvWithHeaderMapper.class)
    public void checkLengthOfOuterArray(int startIndex, int endIndex,int firstArrSize, int secondArrSize, int expRes){
        int flag=0;
        int[][] testArr=TwoDemensionalArrayOfRandomNums.createAndPopulate(startIndex,endIndex,firstArrSize,secondArrSize);
        if(testArr.length!=firstArrSize){
            flag=1;
        }
    }

    @Test
    @FileParameters(value="src/test/resources/TwoDemensionalFromLesson7.csv",
            mapper= CsvWithHeaderMapper.class)
    public void checkLengthOfInnerArray(int startIndex, int endIndex,int firstArrSize, int secondArrSize, int expRes){
        int flag=0;
        int[][] testArr=TwoDemensionalArrayOfRandomNums.createAndPopulate(startIndex,endIndex,firstArrSize,secondArrSize);
        for(int i=0;i<testArr.length;i++){
            if(testArr[i].length!=secondArrSize){
                flag=1;
            }
        }

    }
}
