package com.annashabalina.app.classwork.lesson14;

/**
 * Created by Пользователь on 16.11.2016.
 */
public class Person {
    protected String name;
    protected int age;

    public Person(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        System.out.println(this.name + " is "+this.age+" years old.");
        return age;
    }

    public String getResponse(String question){
        return question;
    }
}
