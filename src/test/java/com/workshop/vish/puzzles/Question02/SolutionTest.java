package com.workshop.vish.puzzles.Question02;

import com.workshop.vish.puzzles.Question02.Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution sObj;
    private int a;
    private int b;

    @Test
    public void test01() {
        sObj = new Solution();
        a = 2;
        b = 5;
        int result = sObj.subtract(a, b);
        assertEquals(-3, result);
    }

}
