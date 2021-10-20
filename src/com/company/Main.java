package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
//        integers.add(1);
//        integers.add(3);
//        integers.add(5);
//        integers.add(7);
//        integers.add(9);
//        System.out.println(ArraySum.simpleArraySum(integers));
        //[10, 20, 20, 10, 10, 30, 50, 10, 20]
//        integers.add(10);
//        integers.add(20);
//        integers.add(20);
//        integers.add(10);
//        integers.add(10);
//        integers.add(30);
//        integers.add(50);
//        integers.add(10);
//        integers.add(20);
//
//        System.out.println(SockMerchant.sockMerchant(9, integers));
//8
        //UDDDUDUU
//        System.out.println(CountingValleys.countingValleys(8, "UDDDUDUU"));

        List<Integer> listOne = new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();

        listOne.add(5);
        listOne.add(6);
        listOne.add(7);

        listTwo.add(3);
        listTwo.add(6);
        listTwo.add(10);

        System.out.println(CompareTriplets.compareTriplets(listOne, listTwo));
    }
}
