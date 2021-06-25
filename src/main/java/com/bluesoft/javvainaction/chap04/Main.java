package com.bluesoft.javvainaction.chap04;


import java.util.Arrays;
import java.util.List;

class Main {
    private static int sum;

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        int count = Dish.menu.stream()
                .map(d -> 1)
                .reduce(0,Integer::sum);

        System.out.println(count);

        var calories = Dish.menu.stream()
                .map(Dish::getCalories)
                .reduce(0,Integer::sum);

        System.out.println(calories);
    }
}
