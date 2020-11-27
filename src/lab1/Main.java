package lab1;

import static lab1.lab1.remainder;
import static lab1.lab1.triArea;
import static lab1.lab1.animals;
import static lab1.lab1.profitableGamble;
import static lab1.lab1.operation;
import static lab1.lab1.ctoa;
import static lab1.lab1.addUpTo;
import static lab1.lab1.nextEdge;
import static lab1.lab1.sumOfCubes;
import static lab1.lab1.abcmath;

public class Main {
    public static void main(String[] args) {
        System.out.println(remainder(1, 3));
        System.out.println(triArea(3, 2));
        System.out.println(animals(2, 3, 5));
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(operation(24, 15, 9));
        System.out.println(ctoa('A'));
        System.out.println(addUpTo(3));
        System.out.println(nextEdge(8, 10));
        System.out.println(sumOfCubes(new int[]{1, 5, 9}));
        System.out.println(abcmath(42, 5, 10));
    }
}
