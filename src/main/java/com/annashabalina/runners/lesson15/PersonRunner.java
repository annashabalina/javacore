package com.annashabalina.runners.lesson15;

import com.annashabalina.app.classwork.lesson14.Person;
import com.annashabalina.app.classwork.lesson14.Student;
import com.annashabalina.app.classwork.lesson15.Teacher;

/**
 * Created by Пользователь on 19.11.2016.
 */
public class PersonRunner {
    public static void main(String[] args) {
        Student newStud = new Student("Jake", "Harvard");
        newStud.setAge(24);
        newStud.getAge();
        Person newTeacher = new Teacher("Mr. Simpson", "Stanford");

        System.out.println("Teacher asked: "+newTeacher.getResponse("\"What is Heap?\""));
        System.out.println("Student said: "+ newStud.getResponse("\"What is JVM?\""));
    }
}
