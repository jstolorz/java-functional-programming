package com.bluesoft.javvainaction.chap03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Filters {

    static  <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> result = new ArrayList<>();

        for (T t : list){
            if(predicate.test(t)){
                result.add(t);
            }
        }
        return result;
    }

    static <T> void forEach(List<T> list, Consumer<T> consumer){
        for(T t : list){
            consumer.accept(t);
        }
    }

    static <T,R> List<R> map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for(T t : list){
            result.add(function.apply(t));
        }
        return result;
    }
}
