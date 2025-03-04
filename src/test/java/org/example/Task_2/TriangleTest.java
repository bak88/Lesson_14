package org.example.Task_2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void testGetAreaTriangular() {
        Triangle triangle = new Triangle(10, 5);
        double area = triangle.getAreaTriangular();
        Assertions.assertThat(area).isEqualTo(25);
    }

    @Test
    public void testZeroBaseTrowsException() {
        try {
            new Triangle(0, 5);
        } catch (IllegalArgumentException ex) {
            Assertions.assertThat(ex).hasMessage("Основание и высота должны быть положительными числами");
        }
    }

    @Test
    public void testZeroHeightTrowsException() {
        try {
            new Triangle(5, 0);
        } catch (IllegalArgumentException ex) {
            Assertions.assertThat(ex).hasMessage("Основание и высота должны быть положительными числами");
        }
    }

    @Test
    public void testNegativBaseTrowsException() {
        try {
            new Triangle(-1, 5);
        } catch (IllegalArgumentException ex) {
            Assertions.assertThat(ex).hasMessage("Основание и высота должны быть положительными числами");
        }
    }

    @Test
    public void testNegativHeightTrowsException() {
        try {
            new Triangle(5, -1);
        } catch (IllegalArgumentException ex){
            Assertions.assertThat(ex).hasMessage("Основание и высота должны быть положительными числами");
        }
    }

}
