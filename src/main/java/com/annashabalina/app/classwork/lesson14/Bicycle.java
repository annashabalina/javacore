package com.annashabalina.app.classwork.lesson14;

/**
 * Created by Пользователь on 16.11.2016.
 */
public class Bicycle {
    int wheelSize;
    String color;
    int frameSize;
    String breakType;

    public Bicycle(int wheelSize, String color, int frameSize, String breakType){
        this.wheelSize=wheelSize;
        this.color=color;
        this.frameSize=frameSize;
        this.breakType=breakType;
    }

    public Bicycle(int wheelSize){
       // this(wheelSize,"yellow",20,"disk");
        this();
        this.wheelSize=wheelSize;
    }

    public Bicycle(){
        this(26,"yellow",20,"disk");
    }
}
