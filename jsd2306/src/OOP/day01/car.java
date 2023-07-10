package OOP.day01;

public class car {
    String brand;
    double price;
    String color;

    car() {

    }

    car(String brand, String color, double price) {

    }

    void start() {
        System.out.println(brand + "牌子的" + color + "颜色的" + price + "块钱的车开始启动了");
    }

    void run() {
        System.out.println(brand + "牌子的" + color + "颜色的" + price + "块钱的车开始开了");
    }

    void stop() {
        System.out.println(brand + "牌子的" + color + "颜色的" + price + "块钱的车停下了");
    }

    public static void main(String[] args) {
        car car1 = new car();
        car1.brand = "awa";
        car1.color = "qwq";
        car1.price = 1000000000L;
        car1.start();
        car1.run();
        car1.stop();
    }
}