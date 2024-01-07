package exercise3;

import java.util.Random;

public class Util {
    protected static int[] createMass(int amountOfElements, int initialNumber, int finalNumber) {
        int[] arr = new int[amountOfElements];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(finalNumber) + initialNumber;
        }
        return arr;
    }

    protected static void printElementsMultiples(int[] array, int multiple) {
        for (int element : array) {
            if (element % multiple == 0) {
                System.out.println(element);
            }
        }
    }
}
