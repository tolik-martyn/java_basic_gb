package hw6;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    int menuV() {
        System.out.println("""
                                
                Введите:
                0 - получить весь список ноутбуков
                1 - установить фильтры и получить список ноутбуков по фильтру
                2 - выйти из программы""");
        while (true) {
            String choice = scanner.nextLine();
            if (isNumeric(choice)) {
                return Integer.parseInt(choice);
            }
            System.out.print("Введите число: ");
        }
    }

    int filterAllV() {
        System.out.println("""                                
                Введите:
                0 - установить текущий фильтр
                1 - пропустить текущий фильтр""");
        while (true) {
            String choice = scanner.nextLine();
            if (isNumeric(choice)) {
                return Integer.parseInt(choice);
            }
            System.out.print("Введите число: ");
        }
    }

    int filterNameV() {
        System.out.println("""                                
                Введите:
                0 - Huawei
                1 - MSI
                2 - Asus
                3 - Acer
                4 - Lenovo
                5 - DELL
                6 - HP
                7 - Apple""");
        while (true) {
            String choice = scanner.nextLine();
            if (isNumeric(choice)) {
                return Integer.parseInt(choice);
            }
            System.out.print("Введите число: ");
        }
    }

    int filterRamV() {
        System.out.println("Введите ОЗУ (от 2 до 32): ");
        while (true) {
            String choice = scanner.nextLine();
            if (isNumeric(choice)) {
                return Integer.parseInt(choice);
            }
            System.out.println("Введите число: ");
        }
    }

    int filterHddV() {
        System.out.println("Введите HDD/SSD (от 128 до 2048): ");
        while (true) {
            String choice = scanner.nextLine();
            if (isNumeric(choice)) {
                return Integer.parseInt(choice);
            }
            System.out.print("Введите число: ");
        }
    }

    int filterOsV() {
        System.out.println("""                                
                Введите:
                0 - Windows
                1 - Linux
                2 - MacOS
                3 - Android
                4 - Dos""");
        while (true) {
            String choice = scanner.nextLine();
            if (isNumeric(choice)) {
                return Integer.parseInt(choice);
            }
            System.out.print("Введите число: ");
        }
    }

    int filterColourV() {
        System.out.println("""                                
                Введите:
                0 - Желтый
                1 - Серый
                2 - Белый
                3 - Зелёный
                4 - Красный
                5 - Оранжевый
                6 - Розовый
                7 - Фиолетовый
                8 - Черный
                9 - Синий""");
        while (true) {
            String choice = scanner.nextLine();
            if (isNumeric(choice)) {
                return Integer.parseInt(choice);
            }
            System.out.print("Введите число: ");
        }
    }

    int filterPriceV() {
        System.out.println("Введите цену: ");
        while (true) {
            String choice = scanner.nextLine();
            if (isNumeric(choice)) {
                return Integer.parseInt(choice);
            }
            System.out.print("Введите число: ");
        }
    }

    int boolV() {
        System.out.println("""                                
                Введите:
                0 - показать значения, больше или равные заданному
                1 - показать значения, меньше или равные заданному""");
        while (true) {
            String choice = scanner.nextLine();
            if (isNumeric(choice)) {
                return Integer.parseInt(choice);
            }
            System.out.print("Введите число: ");
        }
    }

    boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
