package Library;

public class Validator {
    private static final int FIRST_BOTTOM_X = 0;
    private static final int FIRST_BOTTOM_Y = 1;
    private static final int FIRST_TOP_X = 2;
    private static final int FIRST_TOP_Y = 3;
    private static final int SECOND_BOTTOM_X = 4;
    private static final int SECOND_BOTTOM_Y = 5;
    private static final int SECOND_TOP_X = 6;
    private static final int SECOND_TOP_Y = 7;

    public static boolean isNumberNotInIntegerRange(long number) {
        return number > Integer.MAX_VALUE || number < Integer.MIN_VALUE;
    }

    public static boolean areRectanglesOverlap(long[] coordinates) {
        if (isSecondRectangleBottomInFirstRecatange(coordinates)) {
            return true;
        } else if (isSecondRectangleTopInFirstRecatange(coordinates)) {
            return true;
        }
        return false;
    }

    private static boolean isSecondRectangleBottomInFirstRecatange(long[] coordinates) {
        return (coordinates[SECOND_BOTTOM_X] >= coordinates[FIRST_BOTTOM_X]
                && coordinates[SECOND_BOTTOM_X] <= coordinates[FIRST_TOP_X]) &&
               (coordinates[SECOND_BOTTOM_Y] >= coordinates[FIRST_BOTTOM_Y] &&
                coordinates[SECOND_BOTTOM_Y] <= coordinates[FIRST_TOP_Y]);
    }

    private static boolean isSecondRectangleTopInFirstRecatange(long[] coordinates) {
        return (coordinates[SECOND_TOP_X] >= coordinates[FIRST_BOTTOM_X]
                && coordinates[SECOND_TOP_X] <= coordinates[FIRST_TOP_X]) &&
               (coordinates[SECOND_TOP_Y] >= coordinates[FIRST_BOTTOM_Y] &&
                coordinates[SECOND_TOP_Y] <= coordinates[FIRST_TOP_Y]);
    }
}
