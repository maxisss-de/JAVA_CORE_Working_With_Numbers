package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {  // void не возрашает данные
        System.out.println("От класса Main");
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Collections.sort(intList);          // Используется для сортировки элементов, присутствующих в указанном списке коллекции, в порядке возрастания.
        for (int x : intList) {
            if (x > 0 && x % 2 == 0)
                System.out.println(x);
        }
        System.out.println();

        System.out.println("От класса StreamMain");
        StreamMain.main(intList);
    }
}
