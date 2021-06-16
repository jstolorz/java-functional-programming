package com.bluesoft.javvainaction.chap04;


class Main {
    public static void main(String[] args) {

        Dish.menu.stream()
                .filter(Dish::isVegetarian)
                .findAny()
                .ifPresent(dish1 -> System.out.println(dish1.getName()));
    }
}
