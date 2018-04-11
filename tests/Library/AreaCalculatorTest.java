package Library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {
    private AreaCalculator areaCalculator;

    @BeforeEach
    void setUp() {
         areaCalculator = new AreaCalculator();
    }
    @Test
     void countArea_calculateSingleRectangleArea() {
        int expected = 8;
        int[] coordinates = {1, 5, -1, 1};
        assertEquals(expected, areaCalculator.calculateRectagleArea(coordinates));
    }


    @Test
    void calculateCommonRectangleArea_throwsErrorWhenCoordinatesOutOfIntegerRange() {
        long[] coordinates = {9999999999999L, 5, -9, -555555555, 999999999, 5, -9, -555555555};
        assertThrows(IllegalArgumentException.class, () -> {
            areaCalculator.calculateRectanglesCommonArea(coordinates);
        });
    }

    @Test
    void calculateCommonRectangleArea_return36FromCanvasData() {
        long[] coordinates = {-1, -1, 10, 10, -1, 0, 3, 9};
        int expectedArea = 36;
        assertEquals(expectedArea, areaCalculator.calculateRectanglesCommonArea(coordinates));
    }

    @Test
    void calculateCommonRectangleArea_return0FromCanvasDataForNotOverlapingRectangles() {
        long[] coordinates = {-12, -4, -1, -2, 0, 0, 100, 3000};
        int expectedArea = 0;
        assertEquals(expectedArea, areaCalculator.calculateRectanglesCommonArea(coordinates));
    }
}