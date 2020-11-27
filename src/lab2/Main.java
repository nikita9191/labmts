package lab2;

import static lab2.lab2.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(repeat("mice", 5));
        System.out.println(differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(isAvgWhole(new int[]{1,3}));
        System.out.println(Arrays.toString(cumulativeSum(new int[]{1, 2, 3})));
        System.out.println(getDecimalPlaces("43.20"));
    }
}
