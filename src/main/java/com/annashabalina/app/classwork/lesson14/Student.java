package com.annashabalina.app.classwork.lesson14;

/**
 * Created by Пользователь on 16.11.2016.
 */
public class Student extends Person {
    protected String university;

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    @Override
    public String getResponse(String question) {
        return ("\"Ehh, what was the question?\"");
    }

    public void printName() {
        System.out.println(this.name);
    }

    public String setUniversity(String university) {
        this.university = university;
        return university;
    }

    public void getUniversity() {
        System.out.println(this.name + " is a student of " + this.university + ".");
    }
}
