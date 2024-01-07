package exercise2;

import java.util.Scanner;

public class Util {
    protected static void sayHelloVyacheslav() {
        Scanner scanner = new Scanner(System.in);
        String introducedName;
        do {
            System.out.println("Введите имя:");
            introducedName = scanner.nextLine();
            if (introducedName.equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав!");
                break;
            } else{
                System.out.println("Нет такого имени");
            }
        }
        while (true);
    }
}

