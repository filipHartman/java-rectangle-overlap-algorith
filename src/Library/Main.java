package Library;

public class Main {

    public static void main(String[] args) {
        long[] coordinates = {9999999999999L, 5, -9, -555555555, 999999999, 5, -9, -555555555};
        AreaCalculator areaCalculator = new AreaCalculator();
        int area = areaCalculator.calculateRectanglesCommonArea(coordinates);
        System.out.println(area);
    }
}
