package exercise2;

import java.util.Scanner;

public class Util {
    protected static void sayHelloNameRusAndEng(String name) {
        Scanner scanner = new Scanner(System.in);
        String introducedName;
        while (true) {
            if ((name.matches("[а-яА-Я]+"))) {
                System.out.println("Введите имя:");
            } else {
                System.out.println("Enter the name:");
            }
            introducedName = scanner.nextLine();
            if (name.matches("[а-яА-Я]+")) {
                if (!introducedName.matches("[а-яА-Я]+")) {
                    System.out.println("Вводить имя требуется только буквами алфавита кирилица.");
                } else if (introducedName.equalsIgnoreCase(name)) {
                    System.out.printf("Привет, %s!%n", name);
                    break;
                } else {
                    System.out.println("Нет такого имени.");
                }
            } else if (name.matches("[a-zA-Z]+")) {
                if (!introducedName.matches("[a-zA-Z]+")) {
                    System.out.println("Enter the name only in Latin letters.");
                } else if (introducedName.equalsIgnoreCase(name)) {
                    System.out.printf("Hello, %s!%n", name);
                    break;

                } else {
                    System.out.println("No such name.");
                }
            }
        }
    }
}

