package com.subs.alphawizard.A_SingleTon;

import java.util.Map;

public class Hotel {
    private int weekdayPrice;
    private int weekendPrice;

    private Rate rate;

    private String hotelName;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Hotel(String hotelName, int weekdayPrice, int weekendPrice) {
        this.weekdayPrice = weekdayPrice;
        this.weekendPrice = weekendPrice;
        this.hotelName=hotelName;
    }

    public int getWeekdayPrice() {
        return weekdayPrice;
    }

    public void setWeekdayPrice(int weekdayPrice) {
        this.weekdayPrice = weekdayPrice;
    }

    public int getWeekendPrice() {
        return weekendPrice;
    }

    public void setWeekendPrice(int weekendPrice) {
        this.weekendPrice = weekendPrice;
    }
}
