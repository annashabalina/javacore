package com.annashabalina.app.homework.lesson14;

/**
 * Created by Пользователь on 18.11.2016.
 */
public class WhiteCollar extends Human{
    protected String companyName;

    public WhiteCollar(String name, int age, String companyName){
        super(name,age);
        setCompanyName(companyName);
    }

    public void setCompanyName(String companyName){
        if(companyName.matches("[a-zA-Z\\s,-]*")){
            this.companyName=companyName;
            System.out.println("Company name is set to "+companyName);
        }else{
            System.out.println("Only letters are allowed in company name");
        }
    }

    public String getCompanyName(){
        return companyName;
    }
    public void meetWhiteCollar(){
        System.out.println("White Collar's name is "+this.name+", age is "+this.age+", works for "+this.companyName);
    }
}
