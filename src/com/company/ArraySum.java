package com.company;

import java.util.List;

public class ArraySum {

    public static int simpleArraySum(List<Integer> ar) {
        int totalSum = 0;
        for (int i = 0; i < ar.size(); i++) {
            totalSum += ar.get(i);
        }

        return totalSum;

    }

}
