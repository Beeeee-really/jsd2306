package ooday01;
/** 汽车类的测试类 */
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "奔弛";
        car1.color = "黑";
        car1.price = 80;
        car1.start();
        car1.run();
        car1.stop();

        Car car2 = new Car("奥迪","银色",40);
        car2.start();
        car2.run();
        car2.stop();

        Car car3 = new Car("特斯拉","白",70);
        car3.start();
        car3.run();
        car3.stop();
    }
}

















