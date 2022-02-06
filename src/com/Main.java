package com;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);
        list.removeIf(i -> i % 3 == 0);
        System.out.println("First task");
        System.out.println(list);
        List<String> fruitsArray = new ArrayList<>();
        fruitsArray.add("Apple");
        fruitsArray.add("Banana");
        fruitsArray.add("Orange");
        fruitsArray.add("Guava");
        fruitsArray.add("Grapefruit");
        int index = fruitsArray.indexOf("Orange");
        if (index == -1) {
            System.out.println("No Orange");
        } else {
            fruitsArray.set(index, "Grapefruit");
        }
        System.out.println("Second task");
        System.out.println(fruitsArray);

        List<String> workersBrigade1 = new ArrayList<>();
        List<String> workersBrigade2 = new ArrayList<>();
        workersBrigade1.add("Jon");
        workersBrigade1.add("Bon");
        workersBrigade1.add("Vason");
        workersBrigade1.add("Oleg");

        workersBrigade2.add("Oleg");
        workersBrigade2.add("Vasysualiy");
        workersBrigade2.add("Roberto");
        workersBrigade2.add("Paul");

        workersBrigade1.retainAll(workersBrigade2);
        System.out.println("Third task");
        System.out.println(workersBrigade1);
    }
}
