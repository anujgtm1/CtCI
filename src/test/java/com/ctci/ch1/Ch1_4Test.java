package com.ctci.ch1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Ch1_4Test {

    Ch1_4 object;

    @Before
    public void setUp() throws Exception {
        object = new Ch1_4();
    }

    @Test
    public void whenCanMakePermutation_thenReturnsTrue() {
        assertTrue(object.checkPalindromePermutation("Tact Coa"));
    }

    @Test
    public void whenNotPalindrome_thenReturnsFalse() {
        assertFalse(object.checkPalindromePermutation("Tact Coaa"));
    }

    @Test
    public void whenOddCharactersPalin_thenReturnsTrue() {
        assertTrue(object.checkPalindromePermutation("abacb"));
    }

    @Test
    public void whenEvenCharsPalindrome_thenReturnsTrue() {
        assertTrue(object.checkPalindromePermutation("bacabc"));
    }
}
