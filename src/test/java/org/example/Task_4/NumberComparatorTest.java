package org.example.Task_4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberComparatorTest {

    @Test
    public void testCompareMore() {
        NumberComparator numberComparator = new NumberComparator(10, 4);
        Assert.assertTrue(10 > 4);
        numberComparator.compare();
    }

    @Test
    public void testCompareLess() {
        NumberComparator numberComparator = new NumberComparator(4, 10);
        Assert.assertTrue(4 < 10);
        numberComparator.compare();
    }

    @Test
    public void testCompareEqual() {
        NumberComparator numberComparator = new NumberComparator(10, 10);
        Assert.assertTrue(10 == 10);
        numberComparator.compare();
    }

    @Test
    public void testCompareNegativeMore() {
        NumberComparator numberComparator = new NumberComparator(4, 10);
        Assert.assertFalse(4 > 10);
    }

    @Test
    public void testCompareNegativeLess(){
        NumberComparator numberComparator = new NumberComparator(10, 4);
        Assert.assertFalse(10 < 4);
    }

    @Test
    public void testCompareNegativEqual() {
        NumberComparator numberComparator = new NumberComparator(11, 10);
        Assert.assertFalse(11 == 10);
    }
}
