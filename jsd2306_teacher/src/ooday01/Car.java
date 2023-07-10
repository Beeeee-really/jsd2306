package ooday01;
/** 汽车类 */
public class Car {
    String brand; //品牌
    String color; //颜色
    double price; //价格

    Car(){
    }
    Car(String brand,String color,double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    void start(){
        System.out.println(brand+"牌子的"+color+"颜色的"+price+"块钱的车启动了...");
    }
    void run(){
        System.out.println(brand+"牌子的"+color+"颜色的"+price+"块钱的车开始跑了...");
    }
    void stop(){
        System.out.println(brand+"牌子的"+color+"颜色的"+price+"块钱的车停止了...");
    }
}












