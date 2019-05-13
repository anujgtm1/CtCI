package com.ctci.ch1;

/**
 * URLify spaces in the given string
 */

public class Ch1_3 {

    public String URLify(char[] input, int length) {
        int space_count = 0;
        for (int i = 0; i < length; i++) {
            if (input[i] == ' ')
                ++space_count;
        }

        int array_index = length + space_count * 2 - 1;
        int length_index = length - 1;

        while (array_index > length_index) {
            if (input[length_index] == ' ') {
                input[array_index--] = '0';
                input[array_index--] = '2';
                input[array_index--] = '%';
                --length_index;
            } else {
                input[array_index] = input[length_index];
                --length_index;
                --array_index;
            }
        }
        return new String(input);
    }

}
