package com.annashabalina.app.classwork.lesson16;

/**
 * Created by Пользователь on 26.11.2016.
 */
public enum Holidays {
        NEW_YEAR(1,"January","New Year"), ST_VALENTINE(14,"February","Saint Valentine's Day"), INDEPENDENCE_DAY(24,"August","Independence Day");
    // private Holidays(int date, String month, String holidayName) {}
    private int date;
    private String month;
    private String holidayName;

    private Holidays(int date, String month, String holidayName){
        this.date=date;
        this.month=month;
        this.holidayName=holidayName;
    }

    public static void main(String[] args) {
        System.out.println();
        for(Holidays holiday:Holidays.values()){
            System.out.println(holiday.holidayName + " is on " + holiday.month +", "+holiday.date);
        }
    }
}
