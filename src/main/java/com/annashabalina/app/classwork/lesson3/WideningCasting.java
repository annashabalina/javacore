package com.annashabalina.app.classwork.lesson3;

/**
 * Created by Пользователь on 08.10.2016.
 */
public class WideningCasting {
   static byte byte1=127;
    static short short1=0;
    static int int1=0;
    static long long1=0L;
    static float float1=0.0f;
    static double double1 = 0.0d;

    //correct conversion 64f<=32f<=64<=32<=16<=8
    public static void main(String[] args) {
        double1 = float1 = long1 = int1 = short1 = byte1;
        System.out.println(double1);
    }
}

class NarrowingCasting{
    int int1=0;
    float float1=3.14159f;

    public void narrowing(){
        int1=(int) float1;
     System.out.println(int1);
    }
}

class NarrowingCastingRunner{
    public static void main(String[] args) {
        NarrowingCasting casting = new NarrowingCasting();
        casting.narrowing();
    }
}
