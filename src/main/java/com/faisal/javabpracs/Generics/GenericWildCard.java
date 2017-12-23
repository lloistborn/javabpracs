package com.faisal.javabpracs.Generics;

import java.util.List;

public class GenericWildCard {

    public static double sum(List<? extends Number> list) {
        double sum = 0;

        for (Number n : list) {
            sum += n.doubleValue();
        }

        return sum;
    }

    public static <T> List listData(List<?> list) {
        return list;
    }
}
