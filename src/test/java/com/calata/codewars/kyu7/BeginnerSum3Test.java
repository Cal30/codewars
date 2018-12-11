package com.calata.codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeginnerSum3Test {

    BeginnerSum3 s = new BeginnerSum3();

    @Test
    public void Test1()
    {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
    }
}