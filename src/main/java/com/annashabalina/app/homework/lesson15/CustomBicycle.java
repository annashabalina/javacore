package com.annashabalina.app.homework.lesson15;

/**
 * Created by Пользователь on 20.11.2016.
 */
public class CustomBicycle extends Bicycle {
    public void setSpeed(int speed){
        this.speed = speed;
        System.out.println("Custom speed is: "+this.speed);
    }

    public void setGear(int gear){
        this.gear=gear;
        System.out.println("Custom gear is: "+this.gear);
    }

    @Override
    public void ride(){
        System.out.println("Wshhhh!");
    }
}
