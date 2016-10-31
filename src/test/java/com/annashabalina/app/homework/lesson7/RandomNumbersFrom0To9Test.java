package com.annashabalina.app.homework.lesson7;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Пользователь on 30.10.2016.
 */
public class RandomNumbersFrom0To9Test {
    @Test
    public void checkLength(){
        int expRes = 15;
        Assert.assertEquals(expRes,RandomNumbersFrom0To9.createAndPopulate().length);
    }

    @Test
    public void notLessThenZero(){
        int expRes = 0;
        int flag = 0;
        int[] testArr= RandomNumbersFrom0To9.createAndPopulate();
        for(int i=0;i<testArr.length;i++){
            if(testArr[i]<0){
                flag=-1;
            }
        }
        Assert.assertEquals(expRes,flag);
    }

    @Test
    public void notBiggerThen9(){
        int expRes = 0;
        int flag = 0;
        int[] testArr=RandomNumbersFrom0To9.createAndPopulate();
        for(int i=0; i<testArr.length;i++){
            if(testArr[i]>9){
                flag = 10;
            }
        }
        Assert.assertEquals(expRes,flag);
    }
}
