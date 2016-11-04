package com.annashabalina.app.classwork.lesson10;

import com.annashabalina.app.utils.PrimitiveConvertor;
import com.sun.javafx.scene.traversal.SceneTraversalEngine;

/**
 * Created by Пользователь on 02.11.2016.
 */
public class PrimitivesToString {
    public static void main(String[] args) {
        PrimitivesToString.convertDoubleToString(5.67d);
        PrimitivesToString.convertBooleanToString(true);
        PrimitivesToString.convertIntToString(13);

        PrimitivesToString.convertFromStringToDouble("4.14");
        PrimitivesToString.convertFromStringToBoolean("false");
        PrimitivesToString.convertFromStringToInt("345");
    }

    public static String convertDoubleToString(double d){
        String str = String.valueOf(d);
        System.out.println(str);
        return str;
    }

    public static double convertFromStringToDouble(String s){
        double d = Double.valueOf(s);
        System.out.println(d);
        return d;
    }

    public static String convertBooleanToString(boolean b){
        String str = String.valueOf(b);
        System.out.println(str);
        return str;
    }

    public static boolean convertFromStringToBoolean(String s){
        boolean b = Boolean.valueOf(s);
        System.out.println(b);
        return b;
    }

    public static String convertIntToString(int i){
        String str = String.valueOf(i);
        System.out.println(str);
        return str;
    }

    public static int convertFromStringToInt(String s){
        int i = Integer.valueOf(s);
        System.out.println(i);
        return i;
    }
}
