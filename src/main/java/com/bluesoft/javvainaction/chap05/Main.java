package com.bluesoft.javvainaction.chap05;

import com.bluesoft.javvainaction.chap04.Dish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.bluesoft.javvainaction.chap04.Dish.*;

class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        int calories = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();

        System.out.println(calories);

        OptionalInt maxCalories = menu.stream()
                .mapToInt(Dish::getCalories)
                .max();

        System.out.println(maxCalories.orElse(1));

        IntStream even = IntStream.rangeClosed(1,100)
                .filter(n -> n % 2 == 0);

        System.out.println(even.toArray());

        System.out.println("---------------3P-------------------------");

        Stream<int[]> pytagoreanTriples = IntStream.rangeClosed(1,100)
                .boxed()
                .flatMap(a ->
                  IntStream.rangeClosed(a,100)
                  .filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
                  .mapToObj(b -> new int[]{a,b,(int)Math.sqrt(a*a+b*b)}));


        pytagoreanTriples.limit(5)
                .forEach(n -> System.out.println(n[0] + ", " + n[1] + ", " + n[2]));

        Stream<String> stream = Stream.of("Modern ","Java ","In ","Action ");
        stream.map(String::toUpperCase)
                .forEach(System.out::println);

        Stream.iterate(0, n -> n +2)
                .limit(20)
                .forEach(System.out::println);



    }
}
