package com.ctci.ch1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Ch1_1Test {
    Ch1_1 object;

    @Before
    public void setUp() throws Exception {
        object = new Ch1_1();
    }

    @Test
    public void whenEmptyString_thenReturnsTrue() {
        assertTrue(object.hasUnique(""));
        assertTrue(object.checkUniqueBruteForce(""));
    }

    @Test
    public void whenSingleCharacter_thenReturnsTrue() {
        assertTrue(object.hasUnique("a"));
        assertTrue(object.checkUniqueBruteForce("a"));
    }

    @Test
    public void whenAllUnique_thenReturnTrue() {
        assertTrue(object.hasUnique("abcdef"));
        assertTrue(object.checkUniqueBruteForce("abcdef"));
    }

    @Test
    public void whenNotUnique_thenReturnFalse() {
        assertFalse(object.hasUnique("abcda"));
        assertFalse(object.checkUniqueBruteForce("abcda"));
    }

    @Test
    public void whenInitialCharactersEqual_thenReturnFalse() {
        assertFalse(object.hasUnique("aabcde"));
        assertFalse(object.checkUniqueBruteForce("aabcde"));
    }
}
