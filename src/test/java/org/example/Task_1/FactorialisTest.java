package org.example.Task_1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialisTest {

    @Test
    public void testFactorialisNumber() {
        Factorialis factorialis = new Factorialis(5);
        int result = factorialis.getFactorialisNumber();
        Assertions.assertThat(result).isEqualTo(120);
    }

    @Test
    public void testFactorialisNumberNegative() {
        Factorialis factorialis = new Factorialis(-1);
        int result = factorialis.getFactorialisNumber();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testFactorialisNumberZero() {
        Factorialis factorialis = new Factorialis(0);
        int result = factorialis.getFactorialisNumber();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testFactorialisNumberOne() {
        Factorialis factorialis = new Factorialis(1);
        int result = factorialis.getFactorialisNumber();
        Assertions.assertThat(result).isEqualTo(1);
    }
}
