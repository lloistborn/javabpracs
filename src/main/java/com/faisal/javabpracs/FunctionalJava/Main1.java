package com.faisal.javabpracs.FunctionalJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main1 {
    public static void main(String[] args) {


        IntStream.iterate(0, i -> (i + 1) % 2) // 0, 1, 0, 1, 0, 1 ...
            .parallel()
            .distinct() // 0, 1
            .limit(10)
            .forEach(System.out::println);

    }

    private static String handleCoffee(Coffee coffee, Function<Coffee, String> func) {
        System.out.println("coffee " + coffee.getName());
        return func.apply(coffee);
    }

    private static String createFullName(Coffee coffee) {
        String name = "";

        if (coffee.getName().equalsIgnoreCase("americano")) {
            return coffee.getName() + " - " + coffee.getCaffeine();

        }
        if (!coffee.getName().equalsIgnoreCase("americano")) {
            return "not americano";
        }

        return name;
    }
}

