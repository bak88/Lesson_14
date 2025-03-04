package org.example.Task_4;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class NumberComparatorTest {

    @Test
    public void testCompareMore() {
        NumberComparator numberComparator = new NumberComparator(10, 4);
        Assumptions.assumeTrue(10 > 4);
        numberComparator.compare();
    }

    @Test
    public void testCompareLess(){
        NumberComparator numberComparator = new NumberComparator(4, 10);
        Assumptions.assumeTrue(4 < 10);
        numberComparator.compare();
    }

    @Test
    public void testCompareEqual() {
        NumberComparator numberComparator = new NumberComparator(10, 10);
        Assumptions.assumeTrue(10 == 10);
        numberComparator.compare();
    }

    @Test
    public void testCompareNegativeMore() {
        NumberComparator numberComparator = new NumberComparator(4, 10);
        Assumptions.assumeFalse(4 > 10);
        numberComparator.compare();
    }

    @Test
    public void testCompareNegativeLess(){
        NumberComparator numberComparator = new NumberComparator(10, 4);
        Assumptions.assumeFalse(10 < 4);
        numberComparator.compare();
    }

    @Test
    public void testCompareNegativEqual() {
        NumberComparator numberComparator = new NumberComparator(11, 10);
        Assumptions.assumeFalse(11 == 10);
        numberComparator.compare();
    }
}
