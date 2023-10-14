package hw6;

public class Laptop {

    int id;
    String name;
    String ram;
    String hdd;
    String os;
    String colour;
    String price;

    public String toString() {
        return "id: " + id + ", " + name + ", ОЗУ: " + ram + ", HDD/SSD: " + hdd + ", ОС: " + os + ", цвет: " + colour + ", цена: " + price + " руб.";
    }
}
