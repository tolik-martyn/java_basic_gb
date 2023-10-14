package hw6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<List<String>> noteB = createNotebooks();
        View view = new View();

        HashSet<List<String>> set = new HashSet<>(noteB);

        while (true) {
            int menu = view.menuV();
            if (menu == 2) {
                System.out.println("Вы вышли из программы, до встречи!");
                break;
            } else if (menu == 0) {
                for (var item : noteB) {
                    System.out.println(item);
                }
            } else if (menu == 1) {

                System.out.println("\nФильтр по производителю:");
                int choice1 = view.filterAllV();
                if (choice1 == 0) {
                    int filterName = view.filterNameV();
                    filterSetName(filterName, noteB, set);
                }

                System.out.println("\nФильтр по ОЗУ:");
                int choice2 = view.filterAllV();
                if (choice2 == 0) {
                    int filterRam = view.filterRamV();
                    int bool2 = view.boolV();
                    filterSetRam(filterRam, bool2, noteB, set);
                }

                System.out.println("\nФильтр по HDD/SSD:");
                int choice3 = view.filterAllV();
                if (choice3 == 0) {
                    int filterHdd = view.filterHddV();
                    int bool3 = view.boolV();
                    filterSetHdd(filterHdd, bool3, noteB, set);
                }

                System.out.println("\nФильтр по ОС:");
                int choice4 = view.filterAllV();
                if (choice4 == 0) {
                    int filterOs = view.filterOsV();
                    filterSetOs(filterOs, noteB, set);
                }

                System.out.println("\nФильтр по цвету:");
                int choice5 = view.filterAllV();
                if (choice5 == 0) {
                    int filterColour = view.filterColourV();
                    filterSetColour(filterColour, noteB, set);
                }

                System.out.println("\nФильтр по цене:");
                int choice6 = view.filterAllV();
                if (choice6 == 0) {
                    int filterPrice = view.filterPriceV();
                    int bool6 = view.boolV();
                    filterSetPrice(filterPrice, bool6, noteB, set);
                }

                System.out.println("Выдов ноутбуков после применения фильтров:");
                for (var item : set) {
                    System.out.println(item);
                }

            } else {
                System.out.println("Введена неверная команда");
            }
        }
    }

    static HashSet<List<String>> createNotebooks() {
        HashSet<List<String>> notebooks = new HashSet<>();
        HashSet<Integer> idData = new HashSet<>();

        Laptop laptop0 = new Laptop();
        createLaptop(laptop0, notebooks, idData);

        Laptop laptop1 = new Laptop();
        createLaptop(laptop1, notebooks, idData);

        Laptop laptop2 = new Laptop();
        createLaptop(laptop2, notebooks, idData);

        Laptop laptop3 = new Laptop();
        createLaptop(laptop3, notebooks, idData);

        Laptop laptop4 = new Laptop();
        createLaptop(laptop4, notebooks, idData);

        Laptop laptop5 = new Laptop();
        createLaptop(laptop5, notebooks, idData);

        Laptop laptop6 = new Laptop();
        createLaptop(laptop6, notebooks, idData);

        Laptop laptop7 = new Laptop();
        createLaptop(laptop7, notebooks, idData);

        Laptop laptop8 = new Laptop();
        createLaptop(laptop8, notebooks, idData);

        Laptop laptop9 = new Laptop();
        createLaptop(laptop9, notebooks, idData);

        Laptop laptop10 = new Laptop();
        createLaptop(laptop10, notebooks, idData);

        Laptop laptop11 = new Laptop();
        createLaptop(laptop11, notebooks, idData);

        Laptop laptop12 = new Laptop();
        createLaptop(laptop12, notebooks, idData);

        Laptop laptop13 = new Laptop();
        createLaptop(laptop13, notebooks, idData);

        Laptop laptop14 = new Laptop();
        createLaptop(laptop14, notebooks, idData);

        Laptop laptop15 = new Laptop();
        createLaptop(laptop15, notebooks, idData);

        Laptop laptop16 = new Laptop();
        createLaptop(laptop16, notebooks, idData);

        Laptop laptop17 = new Laptop();
        createLaptop(laptop17, notebooks, idData);

        Laptop laptop18 = new Laptop();
        createLaptop(laptop18, notebooks, idData);

        Laptop laptop19 = new Laptop();
        createLaptop(laptop19, notebooks, idData);

        Laptop laptop20 = new Laptop();
        createLaptop(laptop20, notebooks, idData);

        Laptop laptop21 = new Laptop();
        createLaptop(laptop21, notebooks, idData);

        Laptop laptop22 = new Laptop();
        createLaptop(laptop22, notebooks, idData);

        Laptop laptop23 = new Laptop();
        createLaptop(laptop23, notebooks, idData);

        Laptop laptop24 = new Laptop();
        createLaptop(laptop24, notebooks, idData);

        Laptop laptop25 = new Laptop();
        createLaptop(laptop25, notebooks, idData);

        Laptop laptop26 = new Laptop();
        createLaptop(laptop26, notebooks, idData);

        Laptop laptop27 = new Laptop();
        createLaptop(laptop27, notebooks, idData);

        Laptop laptop28 = new Laptop();
        createLaptop(laptop28, notebooks, idData);

        Laptop laptop29 = new Laptop();
        createLaptop(laptop29, notebooks, idData);

        Laptop laptop30 = new Laptop();
        createLaptop(laptop30, notebooks, idData);

        Laptop laptop31 = new Laptop();
        createLaptop(laptop31, notebooks, idData);

        Laptop laptop32 = new Laptop();
        createLaptop(laptop32, notebooks, idData);

        Laptop laptop33 = new Laptop();
        createLaptop(laptop33, notebooks, idData);

        Laptop laptop34 = new Laptop();
        createLaptop(laptop34, notebooks, idData);

        Laptop laptop35 = new Laptop();
        createLaptop(laptop35, notebooks, idData);

        Laptop laptop36 = new Laptop();
        createLaptop(laptop36, notebooks, idData);

        Laptop laptop37 = new Laptop();
        createLaptop(laptop37, notebooks, idData);

        Laptop laptop38 = new Laptop();
        createLaptop(laptop38, notebooks, idData);

        Laptop laptop39 = new Laptop();
        createLaptop(laptop39, notebooks, idData);

        Laptop laptop40 = new Laptop();
        createLaptop(laptop40, notebooks, idData);

        Laptop laptop41 = new Laptop();
        createLaptop(laptop41, notebooks, idData);

        Laptop laptop42 = new Laptop();
        createLaptop(laptop42, notebooks, idData);

        Laptop laptop43 = new Laptop();
        createLaptop(laptop43, notebooks, idData);

        Laptop laptop44 = new Laptop();
        createLaptop(laptop44, notebooks, idData);

        Laptop laptop45 = new Laptop();
        createLaptop(laptop45, notebooks, idData);

        Laptop laptop46 = new Laptop();
        createLaptop(laptop46, notebooks, idData);

        Laptop laptop47 = new Laptop();
        createLaptop(laptop47, notebooks, idData);

        Laptop laptop48 = new Laptop();
        createLaptop(laptop48, notebooks, idData);

        Laptop laptop49 = new Laptop();
        createLaptop(laptop49, notebooks, idData);

        return notebooks;
    }

    static void createLaptop(Laptop laptop, HashSet<List<String>> notebook, HashSet<Integer> idD) {

        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();

        MyData myData = new MyData();
        String[] nameD = myData.nameData;
        String[] ramD = myData.ramData;
        String[] hddD = myData.hddData;
        String[] osD = myData.osData;
        String[] colourD = myData.colourData;

        int count = random.nextInt(100, 1000);
        while (idD.contains(count)) {
            count = random.nextInt(100, 1000);
        }
        laptop.id = count;
        idD.add(count);
        list.add("id:" + laptop.id);

        laptop.name = nameD[random.nextInt(0, nameD.length)];
        list.add(laptop.name);
        laptop.ram = ramD[random.nextInt(0, ramD.length)];
        list.add("озу:" + laptop.ram);
        laptop.hdd = hddD[random.nextInt(0, hddD.length)];
        list.add("hdd/ssd:" + laptop.hdd);
        laptop.os = osD[random.nextInt(0, osD.length)];
        list.add(laptop.os);
        laptop.colour = colourD[random.nextInt(0, colourD.length)];
        list.add(laptop.colour);
        laptop.price = Integer.toString(random.nextInt(50000, 100000));
        list.add("цена:" + laptop.price + " руб.");

        notebook.add(list);
    }

    static void filterSetName(int filterN, HashSet<List<String>> noteBoo, HashSet<List<String>> sett) {
        Map<Integer, String> db = new HashMap<>();
        db.put(0, "Huawei");
        db.put(1, "MSI");
        db.put(2, "Asus");
        db.put(3, "Acer");
        db.put(4, "Lenovo");
        db.put(5, "DELL");
        db.put(6, "HP");
        db.put(7, "Apple");
        for (var item : noteBoo) {
            if (!item.contains(db.get(filterN))) {
                sett.remove(item);
            }
        }
    }

    static void filterSetRam(int filterR, int bl2, HashSet<List<String>> noteBoo, HashSet<List<String>> sett) {
        switch (bl2) {
            case 0 -> {
                for (var item : noteBoo) {
                    if (Integer.parseInt(item.get(2).substring(4, 6).replace(" ", "")) < filterR) {
                        sett.remove(item);
                    }
                }
            }
            case 1 -> {
                for (var item : noteBoo) {
                    if (Integer.parseInt(item.get(2).substring(4, 6).replace(" ", "")) > filterR) {
                        sett.remove(item);
                    }
                }
            }
            default -> System.out.println("Введена неверная команда, фильтр по ОЗУ не будет выполнен");
        }
    }

    static void filterSetHdd(int filterH, int bl3, HashSet<List<String>> noteBoo, HashSet<List<String>> sett) {
        switch (bl3) {
            case 0 -> {
                for (var item : noteBoo) {
                    if (Integer.parseInt(item.get(3).substring(8, 12).replace(" ", "")) < filterH) {
                        sett.remove(item);
                    }
                }
            }
            case 1 -> {
                for (var item : noteBoo) {
                    if (Integer.parseInt(item.get(3).substring(8, 12).replace(" ", "")) > filterH) {
                        sett.remove(item);
                    }
                }
            }
            default -> System.out.println("Введена неверная команда, фильтр по HDD/SSD не будет выполнен");
        }
    }

    static void filterSetOs(int filterO, HashSet<List<String>> noteBoo, HashSet<List<String>> sett) {
        Map<Integer, String> db = new HashMap<>();
        db.put(0, "Windows");
        db.put(1, "Linux");
        db.put(2, "MacOS");
        db.put(3, "Android");
        db.put(4, "Dos");
        for (var item : noteBoo) {
            if (!item.contains(db.get(filterO))) {
                sett.remove(item);
            }
        }
    }

    static void filterSetColour(int filterCol, HashSet<List<String>> noteBoo, HashSet<List<String>> sett) {
        Map<Integer, String> db = new HashMap<>();
        db.put(0, "Желтый");
        db.put(1, "Серый");
        db.put(2, "Белый");
        db.put(3, "Зелёный");
        db.put(4, "Красный");
        db.put(5, "Оранжевый");
        db.put(6, "Розовый");
        db.put(7, "Фиолетовый");
        db.put(8, "Черный");
        db.put(9, "Синий");
        for (var item : noteBoo) {
            if (!item.contains(db.get(filterCol))) {
                sett.remove(item);
            }
        }
    }

    static void filterSetPrice(int filterPr, int bl6, HashSet<List<String>> noteBoo, HashSet<List<String>> sett) {
        switch (bl6) {
            case 0 -> {
                for (var item : noteBoo) {
                    if (Integer.parseInt(item.get(6).substring(5, 11).replace(" ", "")) < filterPr) {
                        sett.remove(item);
                    }
                }
            }
            case 1 -> {
                for (var item : noteBoo) {
                    if (Integer.parseInt(item.get(6).substring(5, 11).replace(" ", "")) > filterPr) {
                        sett.remove(item);
                    }
                }
            }
            default -> System.out.println("Введена неверная команда, фильтр по цене не будет выполнен");
        }
    }
}
