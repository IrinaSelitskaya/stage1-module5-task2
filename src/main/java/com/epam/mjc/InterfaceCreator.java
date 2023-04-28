package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        List<Integer>list=new ArrayList<>();
        return arg->{
            for (Integer value:arg){
                list.add(value/divider);
            }
        return list;
        };
    }
}
