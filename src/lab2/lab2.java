package lab2;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class lab2 {
    public static String repeat(String str, int n) {
        return IntStream
                .range(0, str.length())
                .mapToObj(index -> ("" + str.charAt(index)).repeat(n))
                .collect(Collectors.joining());
    }

    public static int differenceMaxMin(int[] numbers) {
        if (numbers.length == 0)
            return -1;

        if (numbers.length == 1)
            return numbers[0];

        Arrays.sort(numbers);
        return numbers[numbers.length - 1] - numbers[0];
    }

    public static boolean isAvgWhole(int[] numbers) {
        double average = Arrays
                .stream(numbers)
                .average()
                .orElseThrow();

        return average % 1 == 0;
    }

    public static int[] cumulativeSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            numbers[i] = sum;
        }

        return numbers;
    }

    public static int getDecimalPlaces(String value) {
        int index = value.indexOf(".");
        if (index == -1)
            return 0;

        return Integer.parseInt(value.charAt(index + 1) + "");
    }
}
