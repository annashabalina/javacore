package com.annashabalina.app.homework.lesson14;

/**
 * Created by Пользователь on 18.11.2016.
 */
public class Human {
    protected String name;
    protected int age;

    public Human(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        if (name.matches("[a-zA-Z\\s.-]*")){
            this.name = name;
        } else {
            System.out.println("Only letters are allowed in the name.");
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 1 || age > 120) {
            System.out.println("Invalid value. Age can be between 1 and 120");
        } else {
            this.age = age;
            System.out.println("Age is set to " + age);
        }
    }

    public int getAge() {
        return age;
    }

    public void meetHuman(){
        System.out.println("Newly created Human's name is "+this.name+", age is "+this.age);
    }
}
