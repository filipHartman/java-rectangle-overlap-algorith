package Library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void isNumberNotInIntegerRange_returnFalseForNumberWithinIntRange() {
        assertFalse(Validator.isNumberNotInIntegerRange(5L));
    }

    @Test
    void isNumberNotInIntegerRange_returnTrueForNumberBiggerThanMaxInt() {
        assertTrue(Validator.isNumberNotInIntegerRange(55555555555L));
    }

    @Test
    void isNumberNotInIntegerRange_returnTrueForNumberSmallerThanMinInt() {
        assertTrue(Validator.isNumberNotInIntegerRange(-77777777777L));
    }
    @Test
    void areRectanglesOverlap_returnTrueIfBottomOfSecondRectangleInFirst() {
        long[] coordinates = {1,1,3,3, 2,2,4,4};
        assertTrue(Validator.areRectanglesOverlap(coordinates));
    }

    @Test
    void areRectanglesOverlap_returnTrueIfTopOfSecondRectangleInFirst() {
        long[] coordinates = {1,1,3,3, -2,-2,2,2};
        assertTrue(Validator.areRectanglesOverlap(coordinates));
    }

    @Test
    void areRectanglesOverlap_returnTrueIfRectanglesAreTheSame() {
        long[] coordinates = {2,2,10,10, 2,2,10,10};
        assertTrue(Validator.areRectanglesOverlap(coordinates));
    }

    @Test
    void areRectanglesOverlap_returnFalseIfRectanglesDontOvelap() {
        long[] coordinates = {1,1,3,3, 4,4,6,6};
        assertFalse(Validator.areRectanglesOverlap(coordinates));
    }

}