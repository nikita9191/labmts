package lab1;

import java.util.Arrays;

public class lab1 {
    public static int remainder(int a, int b) {
        return a % b;
    }

    public static double triArea(double base, double height) {
        return 0.5 * height * base;
    }

    public static int animals(int chickens, int cows, int pigs) {
        return 2 * chickens + 4 * cows + 4 * pigs;
    }

    public static boolean profitableGamble(double prob,
                                           double prize,
                                           double pay) {
        return prob * prize > pay;
    }

    public static String operation(int N,
                                   int a,
                                   int b) {
        if (N == a + b)
            return "added";
        if (N == a - b)
            return "subtracted";
        if (N == a * b)
            return "multiplied";
        if (N == a / b)
            return "divided";
        return "none";
    }

    public static int ctoa(char s) {
        return s;
    }

    public static long addUpTo(int number) {
        return (long) (((1 + number) / 2.0) * number);
    }

    public static double nextEdge(double a, double b) {
        return (a + b) - 1;
    }

    public static int sumOfCubes(int[] numbers) {
        return Arrays.stream(numbers).map(n -> (int) Math.pow(n, 3)).sum();
    }

    public static boolean abcmath(int a, int b, int c) {
        int value = a;
        for (int i = 1; i <= b; i++)
            value += b;
        return value % c == 0;
    }

}
