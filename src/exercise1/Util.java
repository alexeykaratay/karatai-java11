package exercise1;

import java.util.Scanner;

public class Util {

    public static void sayHello() {
        Scanner scanner = new Scanner(System.in);
        int IntroducedFigure;
        do {
            System.out.println("Введите число:");
            IntroducedFigure = scanner.nextInt();
            if (IntroducedFigure > 7) {
                System.out.println("Привет!");
                break;
            }
        }
        while (true);
    }
}
