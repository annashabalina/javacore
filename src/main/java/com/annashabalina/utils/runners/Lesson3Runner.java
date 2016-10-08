package com.annashabalina.utils.runners;

import com.annashabalina.utils.convertors.PrimitiveConvertor;

/**
 * Created by Пользователь on 08.10.2016.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor myTest= new PrimitiveConvertor();
        myTest.floatToChar(68.12f);
        myTest.intToChar(52);
        myTest.charToInt('D');
    }
}
