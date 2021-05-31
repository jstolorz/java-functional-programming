package com.bluesoft.javvainaction.chap02;

import java.util.Arrays;
import java.util.List;


class Main {
    public static void main(String[] args) {



        List<Apple> apples = Arrays.asList(
                new Apple(80,Color.GREEN),
                new Apple(155,Color.GREEN),
                new Apple(120,Color.RED)
        );


        displayApples(apples);

        List<Apple> result = FilteringApples.filterApplesByColor(apples,Color.RED);

        displayApples(result);

        result = FilteringApples.filterAppleByWeight(apples,150);

        displayApples(result);
    }

    static void displayApples(List<Apple> apples){
        for(Apple apple : apples){
            System.out.println(apple);
        }


        System.out.println("----------------------------------------------------");
    }
}

