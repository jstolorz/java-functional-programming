package com.bluesoft.javvainaction.chap03;

import com.bluesoft.javvainaction.chap02.Apple;
import com.bluesoft.javvainaction.chap02.Color;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Main {
    public static void main(String[] args) throws IOException {

        List<String> listOfStrings = Arrays.asList("aa","bb","","dd","","ff");

        String oneLine = ProcessLambda.processFile((BufferedReader br) -> br.readLine());
        System.out.println(oneLine);

        String twoLine = ProcessLambda.processFile((BufferedReader br) -> br.readLine() + br.readLine());

        System.out.println(twoLine);

        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        System.out.println(
                Filters.filter(listOfStrings, nonEmptyStringPredicate)
        );

        Filters.forEach(Arrays.asList(2,3,4,5,6,7), (Integer i) -> System.out.println(i));

        List<String> strings = Arrays.asList("olo","bolo","foo","dino");

        List<Integer> result = Filters.map(strings, (String s) -> s.length());

        System.out.println(result);


        List<String> str = Arrays.asList("a","b","A","B");
        str.sort(String::compareToIgnoreCase);

        System.out.println(str);


        Supplier<Apple> apple = Apple::new;

        Apple a1 = apple.get();
        Color color = Color.RED;


        a1.setWeight(123);
        a1.setColor(color);

        System.out.println(a1);

        BiFunction<Integer,Color,Apple> biFunction = Apple::new;
        Apple a2 = biFunction.apply(156,Color.GREEN);
        System.out.println(a2);

        Map<Integer,Color> apples = new HashMap<>();
        apples.put(120,Color.GREEN);
        apples.put(100,Color.RED);
        apples.put(128,Color.GREEN);





    }
}
