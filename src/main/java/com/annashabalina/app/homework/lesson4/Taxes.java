package com.annashabalina.app.homework.lesson4;

/**
 * Created by Пользователь on 14.10.2016.
 */
public class Taxes {
    private double month1, month2, month3, totalIncome;

    private int taxGroup;

    private double taxesToPay;
    private double moneyLeft;

    //set & get monlthy incomes
    public void setIncomes(double month1, double month2, double month3){
        this.month1=month1;
        this.month2=month2;
        this.month3=month3;
        totalIncome=month1+month2+month3;
    }

    public double getIncomes(){
        return totalIncome;
    }

    //set & get taxgroup
    public void setTaxGroup(int taxGroup){
        this.taxGroup=taxGroup;
    }

    public int getTaxGroup(){
        return taxGroup;
    }

    public double[] calculateMoney(double totalIncome, int taxGroup){
        if(taxGroup==1){
            taxesToPay = totalIncome*0.1;
            moneyLeft = totalIncome-taxesToPay;
            return new double[] {taxesToPay, moneyLeft};
        }
        else if(taxGroup==2){
            taxesToPay=totalIncome*0.2;
            moneyLeft = totalIncome-taxesToPay;
            return new double[] {taxesToPay, moneyLeft};
        }else{
            taxesToPay=totalIncome*0.05;
            moneyLeft = totalIncome-taxesToPay;
            return new double[] {taxesToPay, moneyLeft};
        }
    }
}
