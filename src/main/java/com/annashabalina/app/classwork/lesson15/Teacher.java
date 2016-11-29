package com.annashabalina.app.classwork.lesson15;

import com.annashabalina.app.classwork.lesson14.Person;

/**
 * Created by Пользователь on 19.11.2016.
 */
public class Teacher extends Person {
    protected String university;
    protected String response;
    public Teacher(String name, String university) {
        super(name);
        this.university=university;
    }

 /*   public String getResponse(){
        printOnTable();
        return response;
    }*/

    public void printOnTable(){
        System.out.println("Assume this is a table: "+response);
    }

    public String lessonFinished(){
        return "Don't forget the hometask";
    }
}
