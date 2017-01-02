package com.workshop.vish.puzzles.Question01;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution sObj;
    private int a;
    private int b;

    @Test
    public void test01() {
        sObj = new Solution();
        a = 2;
        b = 5;
        int result = sObj.add(a, b);
        assertEquals(7, result);
    }

}
