package com.bluesoft.javvainaction.chap02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class Main {
    public static void main(String[] args) {



        List<Apple> apples = Arrays.asList(
                new Apple(80,Color.GREEN),
                new Apple(155,Color.GREEN),
                new Apple(120,Color.RED)
        );

        List<Integer> numbers = Arrays.asList(2,3,4,2,3,6,7,5,9);

        displayApples(apples);

        List<Apple> result = Filters.filter(apples,(Apple apple) -> Color.RED.equals(apple.getColor()));

        displayApples(result);

        List<Integer> odds = Filters.filter(numbers, (Integer i) -> i % 2 == 0);

        displayApples(odds);

        apples.sort((Apple a1, Apple a2) -> (a1.getWeight() > a2.getWeight()) ? 1 : -1);

        displayApples(apples);


        Thread t = new Thread(() -> System.out.println("Hello from thread"));
        t.start();

    }

    static <T> void displayApples(List<T> list){
        for(T e : list){
            System.out.println(e);
        }


        System.out.println("----------------------------------------------------");
    }
}

