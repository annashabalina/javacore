package com.annashabalina.runners.lesson14;

import com.annashabalina.app.classwork.lesson14.Student;

/**
 * Created by Пользователь on 16.11.2016.
 */
public class StudentRunner {
    public static void main(String[] args) {
        Student newStudent = new Student("James", "Harvard");
        newStudent.printName();
        newStudent.setAge(22);
        newStudent.getAge();
        //newStudent.setUniversity("Stanford");
        newStudent.getUniversity();
    }
}
