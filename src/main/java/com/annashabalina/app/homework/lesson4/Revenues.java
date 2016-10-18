package com.annashabalina.app.homework.lesson4;

/**
 * Created by Пользователь on 14.10.2016.
 */
public class Revenues {
    private int numberOfItemsSold;
    private double pricePerItem;
    private double revenueFromSale;

    //set & get number of items sold
    public void setNumberOfItemsSold(int itemsSold){
        numberOfItemsSold = itemsSold;
    }

    public int getNumberOfItemsSold(){
        return numberOfItemsSold;
    }

    //set & get price per item
    public void setPricePerItem(double price){
        pricePerItem=price;
    }

    public double getPricePerItem(){
        return pricePerItem;
    }

    //calculate revenue from sales
    public double calculateRevenue(int numberOfItemsSold, double pricePerItem){
        return numberOfItemsSold*pricePerItem;
    }
}
