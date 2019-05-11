package com.ctci.ch1;

import java.util.HashMap;
import java.util.Map;

public class Ch1_2 {

    public boolean isPermutation(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c: s1.toCharArray()) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count+1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c: s2.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }
            int count = map.get(c);
            if (count <= 0) {
                return false;
            }
            map.put(c, count - 1);
        }
        return true;
    }
}
