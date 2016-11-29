package com.annashabalina.app.homework.lesson16;

/**
 * Created by Пользователь on 27.11.2016.
 */
public enum Celebrities {
    LOPEZ("Jennifer Lynn Lopez",47, "alive"), JAMES("LeBron Raymone James", 31, "alive"), DEPP("John Christopher Depp", 53, "alive"),
    ANTHONY("Marco Antonio Muñiz Ruiz",48, "alive"), CIGALA("Diego Ramón Jiménez Salazar",47, "alive"),
    KARDASHIAN("Kimberly Noel Kardashian",36,"alive");

    private String fullName;
    private int age;
    private String lifeStatus;

    private Celebrities(String fullName, int age, String lifeStatus){
        this.fullName=fullName;
        this.age=age;
        this.lifeStatus = lifeStatus;
    }

    public String getFullName(){
        return fullName;
    }

    public int getAge(){
        return age;
    }

    public String getLifeStatus(){return lifeStatus;}
}
