package com.annashabalina.app.classwork.lesson3;

/**
 * Created by Пользователь on 13.10.2016.
 */
public class NarrowingCasting {
        int int1=0;
        float float1=3.14159f;

        public void narrowing(){
            int1=(int) float1;
            System.out.println(int1);
        }
    }
