package com.ctci.ch1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Ch1_3Test {
    Ch1_3 object;

    @Before
    public void setUp() throws Exception {
        object = new Ch1_3();
    }

    @Test
    public void whenEmptyString_thenReturnsEmpty() {
        assertEquals(object.URLify("".toCharArray(), 0), "");
    }

    @Test
    public void whenStringWithoutSpace_thenReturnsSameString() {
        assertEquals(object.URLify("abcde".toCharArray(), 5), "abcde");
    }

    @Test
    public void whenOnlySpace_thenReturnsEncodedString() {
        char[] input = new char[3];
        input[0] = ' ';
        assertEquals(object.URLify(input, 1), "%20");
    }

    @Test
    public void whenValidInput_thenReturnsEncodedString() {
        char[] input = {'a', 'b', ' ', 'c', ' ', 'd', '\u0000', '\u0000', '\u0000', '\u0000'};
        assertEquals(object.URLify(input, 6), "ab%20c%20d");
    }
}
