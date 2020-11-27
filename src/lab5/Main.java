package lab5;

import static lab5.lab5.*;

public class Main {

    public static void main(String[] args) {
        final int[] array = encrypt("Hello");
        System.out.println(decrypt(array));
        System.out.println(canMove("ладья", "A8", "H8"));
        System.out.println(canMove("слон", "A7", "G1"));
        System.out.println(canMove("ферзь", "C4", "D6"));
    }
}
