package com.bluesoft.javvainaction.chap02;

import java.util.ArrayList;
import java.util.List;

class FilteringApples {

    // Bed implementation

    static List<Apple> filterGreenApple(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(apple.getColor() == Color.GREEN){
                result.add(apple);
            }
        }
        return  result;
    }

    static List<Apple> filterApplesByColor(List<Apple> inventory, Color color){
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if(apple.getColor() == color){
                result.add(apple);
            }
        }

        return result;
    }

    static List<Apple> filterAppleByWeight(List<Apple> inventory, int weight){
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if(apple.getWeight() > weight){
                result.add(apple);
            }
        }

        return result;
    }

    //--------------------------------------------------------------------------

    // use strategy

    static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(predicate.test(apple)){
                result.add(apple);
            }
        }
        return  result;
    }

}
