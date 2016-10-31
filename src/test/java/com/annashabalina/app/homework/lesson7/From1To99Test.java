package com.annashabalina.app.homework.lesson7;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Пользователь on 30.10.2016.
 */
public class From1To99Test {
    @Test
    public void checkLength(){
        int expRes=50;
        Assert.assertEquals(expRes, From1To99.createArray().length);
    }

    @Test
    public void notLessThen1(){
        int expRes =0;
        int flag=0;
        int[] testArr = From1To99.createArray();
        for(int i=0; i<testArr.length;i++){
            if(testArr[i]<1){
                flag = 1;
            }
        }
        Assert.assertEquals(expRes, flag);
    }

    @Test
    public void notBiggerThen99(){
        int expRes=0;
        int flag = 0;
        int[] testArr =From1To99.createArray();
        for(int i=0;i<testArr.length;i++){
            if(testArr[i]>99){
                flag=1;
            }
        }
        Assert.assertEquals(expRes,flag);
    }
}
