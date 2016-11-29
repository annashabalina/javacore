package com.annashabalina.app.classwork.lesson16;

import java.util.Arrays;

/**
 * Created by Пользователь on 26.11.2016.
 */
public enum Company {
    EBAY(30,"Ebay Inc"), GOOGLE(15,"Google Inc");
    private int value;
    private String fullName;

    private Company(int value, String fullName){
        this.value=value;
        this.fullName=fullName;
    }

    public int getValue(){
        return value;
    }

    public static void main(String[] args) {
        System.out.println("Ebay's value: "+Company.EBAY.value);
        System.out.println(Company.GOOGLE.fullName);

        Arrays.asList(Company.values()).forEach(company -> System.out.println(company.name()+": Company full name is " +company.fullName));
    }
}
