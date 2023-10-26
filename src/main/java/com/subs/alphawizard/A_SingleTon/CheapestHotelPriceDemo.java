package com.subs.alphawizard.A_SingleTon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CheapestHotelPriceDemo {
    public static void main(String[] args) {

        List<Hotel> list = new ArrayList<>();
        list.add(new Hotel("MB",80,110));
        list.add(new Hotel("MC",120,90));
        list.add(new Hotel("MD",100,150));
        list.add(new Hotel("ME",85,115));
    }
}
