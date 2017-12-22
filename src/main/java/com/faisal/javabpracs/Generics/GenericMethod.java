package com.faisal.javabpracs.Generics;

public class GenericMethod {

    public static <T> boolean isEqual(GenericClass<T> g1, GenericClass<T> g2) {
        return g1.getT().equals(g2.getT());
    }
}
