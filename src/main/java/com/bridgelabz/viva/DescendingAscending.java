package com.bridgelabz.viva;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingAscending {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(4);
        int middleIndex = arrayList.size() / 2;
        List<Integer> firstHalfDescending = arrayList.subList(0, middleIndex).stream().sorted().collect(Collectors.toList());
        List<Integer> secondHalfAscending = arrayList.subList(middleIndex, arrayList.size()).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("firstHalf" + secondHalfAscending + "\nsecondHalf" + firstHalfDescending);
        firstHalfDescending.forEach(i -> secondHalfAscending.add(i));
        System.out.println("Final Sequence :" + secondHalfAscending);
    }
}
// secondHalfAscending.addAll(firstHalfDescending);