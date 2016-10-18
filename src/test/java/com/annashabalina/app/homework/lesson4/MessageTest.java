package com.annashabalina.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Пользователь on 14.10.2016.
 */
public class MessageTest {
    String message= "Hello World!";
    Message myMessageObj = new Message(message);
    @Test
    public void testMessages(){
        Assert.assertEquals(message, myMessageObj.printMessage());
    }
}
