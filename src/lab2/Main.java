package lab2;

public class Main {
    public static void main(String[] args) {
        System.out.println(repeat("mice", 5));
        System.out.println(differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(isAvgWhole(new int[]{1, 5, 6}));
        System.out.println(Arrays.toString(cumulativeSum(new int[]{3, 3, -2, 408, 3, 3})));
        System.out.println(getDecimalPlaces("43.20"));
    }
}
