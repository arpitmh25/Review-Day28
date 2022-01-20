package com.bridgelabz.viva;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenOrder {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(4);
        arrayList.stream().sorted().forEach(System.out::println);
        System.out.println("Size of array is:" + arrayList.size());
        List<Integer> odd = arrayList.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        List<Integer> even = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("OddNumbers" + odd + "\nEvenNumbers" + even);
        even.forEach(i -> odd.add(i));
        System.out.println("Final Sequence :" + odd);
    }
}
//odd.addAll(even);