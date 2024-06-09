package tests;

import org.testng.annotations.Test;
import org.testng.Assert;

public class TestSomethig {

    @Test
    public void testAssertEquals() {
        int actual = 5;
        int expected = 5;
        Assert.assertEquals(actual, expected, "The actual value does not match the expected value");
    }

    @Test
    public void testAssertTrue() {
        boolean condition = (5 > 1);
        Assert.assertTrue(condition, "The condition is not true");
    }

    @Test
    public void testAssertFalse() {
        boolean condition = (1 > 5);
        Assert.assertFalse(condition, "The condition is not false");
    }

    @Test
    public void testAssertNull() {
        Object obj = null;
        Assert.assertNull(obj, "The object is not null");
    }

    @Test
    public void testAssertNotNull() {
        Object obj = new Object();
        Assert.assertNotNull(obj, "The object is null");
    }
}
