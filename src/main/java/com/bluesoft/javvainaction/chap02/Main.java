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

        result = FilteringApples.filterApples(apples, new AppleRedAndHeavyPredicate());

        displayApples(result);

        PrintingApple.prettyPrintApple(apples, new AppleExamineWeightFormatter());

        // Anonymize class for select RED apple

        result = FilteringApples.filterApples(apples, new ApplePredicate() {
            @Override
            public boolean test(final Apple apple) {
                return Color.RED.equals(apple.getColor());
            }
        });

        displayApples(result);

        // Lambda expression for select Red apple

        result = FilteringApples.filterApples(apples, (Apple apple) -> Color.RED.equals(apple.getColor()));

        displayApples(result);
    }

    static void displayApples(List<Apple> apples){
        for(Apple apple : apples){
            System.out.println(apple);
        }


        System.out.println("----------------------------------------------------");
    }
}

