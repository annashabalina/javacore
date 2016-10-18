package com.annashabalina.app.homework.lesson4;

/**
 * Created by Пользователь on 14.10.2016.
 */
public class Message {
    private String message;

    public Message(String message){
        this.message=message;
    }

    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
