package com.ctci.ch1;

import java.util.HashMap;
import java.util.Map;

/**
 * Check if the string is a permutation of a palindrome
 *
 * Counts all the characters and returns false if more than 1 character count is odd
 */

public class Ch1_4 {

    public boolean checkPalindromePermutation(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c: input.toLowerCase().toCharArray()) {
            if (c == ' ')
                continue;
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }

        boolean hasOdd = false;
        for (Integer val: map.values()) {
            System.out.println("val = " + val);
            if (val % 2 != 0) {
                if (hasOdd) {
                    return false;
                } else {
                    hasOdd = true;
                }
            }
        }

        return true;
    }

}
