package com.testing.kapitel1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleTests {

    @Test
    public void AdduptoNtest() {
        Calculator calc = new Calculator();
        int result = calc.AddupToN(10);
        assertEquals(55,result);
    }
}