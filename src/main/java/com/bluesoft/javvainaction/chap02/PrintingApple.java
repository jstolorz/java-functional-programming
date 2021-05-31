package com.bluesoft.javvainaction.chap02;

import java.util.List;

class PrintingApple {

    static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter){
        for(Apple apple: inventory){
            System.out.println(formatter.accept(apple));
        }
    }

}
