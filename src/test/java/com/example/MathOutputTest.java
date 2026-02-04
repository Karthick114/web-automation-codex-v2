package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathOutputTest {
    @Test
    public void printsAdditionResult() {
        int result = 5 + 5;
        System.out.println("Addition Result: 10");
        Assert.assertEquals(result, 10);
    }
}
