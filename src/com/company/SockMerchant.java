package com.company;

import java.util.*;

public class SockMerchant {
    public static int sockMerchant(int n, List<Integer> ar) {
        int pairs = 0;
        Map<Integer,Integer> socks = new HashMap<>();

        for (int i = 0; i < ar.size(); i++) {
            if (socks.containsKey(ar.get(i))) {
                int count = socks.get(ar.get(i));
                count++;
                socks.put(ar.get(i), count);
            } else {
                int count = 1;
                socks.put(ar.get(i), count);
            }
        }

        System.out.println(socks);

        for (Integer sockPairs : socks.keySet()) {
            for (int i = 1; i <= socks.get(sockPairs); i++) {
                if (i % 2 == 0) {
                    pairs++;
                }
            }
        }

        return pairs;
    }
}
