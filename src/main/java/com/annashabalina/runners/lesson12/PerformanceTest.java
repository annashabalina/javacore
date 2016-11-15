package com.annashabalina.runners.lesson12;

/**
 * Created by Пользователь on 09.11.2016.
 */
public class PerformanceTest {
    public static void main(String[] args) {
/*        long start = System.currentTimeMillis();
        String c = "start";
        String b = "finish";
        for (long i = 0; i < 100000L; i++)
            c = c.concat(b);
        long end = System.currentTimeMillis();
        System.out.println("for string"end - start);*/


        long start = System.currentTimeMillis();
        StringBuilder c = new StringBuilder("start2");
        String b = "finish2";
        for(long i = 0; i < 100000L; i++){
            c = c.append(b);   }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

}
