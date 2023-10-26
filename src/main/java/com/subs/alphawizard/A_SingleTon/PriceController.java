package com.subs.alphawizard.A_SingleTon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class PriceController {

    @GetMapping("/user/request")
    public Hotel getCheapest(@RequestParam Date date){
        List<Hotel> list = new ArrayList<>();
        list.add(new Hotel("MB",80,110));
        list.add(new Hotel("MC",120,90));
        list.add(new Hotel("MD",100,150));
        list.add(new Hotel("ME",85,115));
        Collections.sort(list,(o1,o2)->{
            if(isWeekendDay(date))
                return o1.getWeekdayPrice()-o2.getWeekendPrice();
            return o1.getWeekdayPrice()-o2.getWeekdayPrice();
        });
        return list.get(0);


    }

    static boolean isWeekendDay(Date date){
        Calendar c1 = Calendar.getInstance();
        c1.setTime(date);
        return c1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY ||
                c1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;

    }

}
