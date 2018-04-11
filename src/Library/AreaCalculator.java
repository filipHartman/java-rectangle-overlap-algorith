package Library;

import static java.lang.Math.abs;

public class AreaCalculator {
    public int calculateRectagleArea(int[] coordinates) {
        int width = coordinates[2] - coordinates[0];
        int heigth = coordinates[3] - coordinates[1];
        return abs(width) * abs(heigth);
    }

    public int calculateRectanglesCommonArea(long[] coordinates) throws IllegalArgumentException {
        for (long coordinate: coordinates) {
//            System.out.println(Validator.isNumberNotInIntegerRange(coordinate) +" "+ coordinate);
            if(Validator.isNumberNotInIntegerRange(coordinate)) {
                throw new IllegalArgumentException("ERROR: Number is not in Integer range!!!");
            }
        }
        if(!(Validator.areRectanglesOverlap(coordinates))) {
            return 0;
        }

        int[] commonRectangleCoordinates = calculateCommonRectangleCoordinates(coordinates);
        return calculateRectagleArea(commonRectangleCoordinates);
    }

    private int[] calculateCommonRectangleCoordinates(long[] coordinates) {
        int[] commonRectangleCoordinates = new int[4];
        commonRectangleCoordinates[0] = (int)(coordinates[0] > coordinates[4] ? coordinates[0] : coordinates[4]);
        commonRectangleCoordinates[1] = (int)(coordinates[1] > coordinates[5] ? coordinates[1] : coordinates[5]);
        commonRectangleCoordinates[2] = (int)(coordinates[2] < coordinates[6] ? coordinates[2] : coordinates[6]);
        commonRectangleCoordinates[3] = (int)(coordinates[3] < coordinates[7] ? coordinates[3] : coordinates[7]);
        return commonRectangleCoordinates;
    }
}
