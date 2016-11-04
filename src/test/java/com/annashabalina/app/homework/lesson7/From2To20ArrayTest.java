package com.annashabalina.app.homework.lesson7;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Пользователь on 02.11.2016.
 */
public class From2To20ArrayTest {
    @Test
    public void checkIfNumsAreEqual(){
        int expRes=0;
        int flag=0;
        int[] testArr= From2To20Array.createEvenNumsArray();
        for(int i = 0;i<testArr.length;i++){
            if(testArr[i]%2!=0){
                flag=1;
            }
        }
        Assert.assertEquals(expRes,flag);
    }
}
