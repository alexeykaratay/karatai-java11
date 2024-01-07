package exercise1;

import java.util.Scanner;

public class Util {

    protected static void sayHello() {
        Scanner scanner = new Scanner(System.in);
        int introducedFigure;
        do {
            System.out.println("Введите число:");
            introducedFigure = scanner.nextInt();
            if (introducedFigure > 7) {
                System.out.println("Привет!");
                break;
            }
        }
        while (true);
    }
}
