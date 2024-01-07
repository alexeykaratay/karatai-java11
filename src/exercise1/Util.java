package exercise1;

import java.util.Scanner;

public class Util {

    protected static void sayHello(int figure) {
        Scanner scanner = new Scanner(System.in);
        double introducedFigure;
        while (true) {
            System.out.println("Введите число:");
            if (scanner.hasNextDouble()) {
                introducedFigure = scanner.nextDouble();
                if (introducedFigure > figure) {
                    System.out.println("Привет!");
                    break;
                }
                if (introducedFigure == figure) {
                    System.out.println("Введено число равное границе, число должно быть строго больше этого значения.");
                }
            } else {
                System.out.println("Ошибка. Введено не корректное значение.");
                scanner.next();
            }
        }
    }
}
