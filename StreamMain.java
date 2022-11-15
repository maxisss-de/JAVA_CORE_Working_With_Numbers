package com.company;

import java.util.Comparator;
import java.util.List;

public class StreamMain {

    public static void main(List<Integer> intList) {    // Передали в () массив List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4); от класса Main, чтобы не было два одинаковых массива
        intList.stream()                                // Stream<Integer> stream  =  intList.stream();
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())      // Comparator.naturalOrder() - Comparable предназначен для определения так называемого естественного порядка ( natural ordering ).
                .forEach(System.out::println);
    }
}
