package com.annashabalina.app.homework.lesson15;

/**
 * Created by Пользователь on 20.11.2016.
 */
public abstract class Bicycle {
    protected double speed;
    protected int gear;
    public void ride(){
        System.out.println("Wroom!");
    }

    public abstract void setSpeed(int speed);
    public abstract void setGear(int gear);
}
