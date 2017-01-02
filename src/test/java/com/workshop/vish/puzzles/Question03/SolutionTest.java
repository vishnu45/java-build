package com.workshop.vish.puzzles.Question03;

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
        int result = sObj.multiply(a, b);
        assertEquals(10, result);
    }

}
