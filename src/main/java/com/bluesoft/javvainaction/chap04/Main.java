package com.bluesoft.javvainaction.chap04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        numbers.stream()
                .filter(i-> i%2 == 0)
                .distinct()
                .forEach(System.out::println);


        List<Dish> slicedMenu = Dish.menu.stream()
                .sorted(Comparator.comparing(Dish::getCalories))
                .dropWhile(dish -> dish.getCalories() < 420)
                .collect(Collectors.toList());

        System.out.println(slicedMenu);


    }
}
