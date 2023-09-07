package com.subs.alphawizard.JavaAndOOPs;

import java.util.Comparator;

class SortByNameThanMarks implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        if(!o1.getName().equals(o2.getName())){
            return o1.getMarks()-o2.getMarks();
        } else return o2.getName().compareTo(o1.getName());

    }

}
