package com.ctci.ch1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Ch1_2Test {
    Ch1_2 object;

    @Before
    public void setUp() throws Exception {
        object = new Ch1_2();
    }

    @Test
    public void whenBothStringsEmtpy_thenReturnsTrue() {
        assertTrue(object.isPermutation("", ""));
    }

    @Test
    public void whenSecondStringEmpty_thenReturnsTrue() {
        assertTrue(object.isPermutation("abc", ""));
    }

    @Test
    public void whenFirstStringEmpty_thenReturnsFalse() {
        assertFalse(object.isPermutation("", "abc"));
    }

    @Test
    public void whenPermutation_thenReturnsTrue() {
        assertTrue(object.isPermutation("abcde", "dcba"));
    }

    @Test
    public void whenPermutationRepeatingCharacters_thenReturnsTrue() {
        assertTrue(object.isPermutation("aabcd", "aba"));
    }

    @Test
    public void whenNotPermutationRepeatingCharacters_thenReturnsFalse() {
        assertFalse(object.isPermutation("abcde", "aab"));
    }

}
