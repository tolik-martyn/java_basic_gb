package hw5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex0();
        ex1("Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, " +
                "Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, " +
                "Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов");
    }

    static void ex0() {
        System.out.println("""
                        
                Задание 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
                Решение:""");

        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> map = new HashMap<>();

        System.out.println("""
                Список команд:
                0 - добавить новый контакт (имя, запятая, далее телефоны через пробел)
                1 - добавить один новый телефон к существующему контакту
                2 - посмотреть список контактов
                3 - выход из программы
                Пример данных для ввода:
                Иван: 999 888 777
                Светлана: 666 555
                Кристина: 444""");

        while (true) {
            System.out.print("Введите конманду: ");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 3) {
                System.out.println("Вы вышли из программы, до встречи!");
                break;
            }

            if (choice == 0) {
                System.out.println("Введите имя контакта, далее двоеточние и один пробел, далее телефон(ы) через пробел):");
                String[] list = scanner.nextLine().split(":");
                List<String> phones = new ArrayList<>();
                for (String number : list[1].split(" ")) {
                    if (number.length() > 0) {
                        phones.add(number);
                    }
                }
                map.put(list[0], phones);
                continue;
            }

            if (choice == 1) {
                System.out.println("Введите имя контакта и добавляемый телефон через пробел):");
                String[] list = scanner.nextLine().split(" ");

                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getKey().equals(list[0])) {
                        List<String> phones = map.get(list[0]);
                        phones.add(list[1]);
                    }
                }
                continue;
            }

            if (choice == 2) {
                if (map.size() > 0) {
                    System.out.println("Список контактов:");
                    for (Map.Entry entry : map.entrySet()) {
                        System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue());
                    }
                } else {
                    System.out.println("Список контактов пустой");
                }

            } else {
                System.out.println("Введена неверная команда");
            }
        }
    }

    static void ex1(String s) {
        System.out.println("""
                        
                Задание 2. Пусть дан список сотрудников: 
                Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, 
                Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, 
                Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. 
                Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
                Отсортировать по убыванию популярности. 
                Для сортировки использовать TreeMap.
                Решение:""");

        String[] names = s.split(", ");

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (String name : names) {
            String[] firstName = name.split(" ");
            int count = 1;
            if (treeMap.containsKey(firstName[0])) {
                count += treeMap.get(firstName[0]);
                treeMap.put(firstName[0], count);
            } else {
                treeMap.put(firstName[0], count);
            }
        }
        List sortArray = new ArrayList(treeMap.entrySet());
        Collections.sort(sortArray, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
            {
                return o2.getValue() - o1.getValue();
            }
        });
        System.out.println("Повторяющиеся имена с количеством повторений, отсортированные по убыванию популярности:");
        System.out.println(sortArray);
    }
}
