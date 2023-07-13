package homework;

public class HomeWork6 {
    public static class Student {

        String name;
        int age;
        String className;
        String stuId;


        Student() {
        }

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        Student(String name, int age, String className, String stuId) {
            this.name = name;
            this.age = age;
            this.className = className;
            this.stuId = stuId;
        }

        void study() {
            System.out.println(name + "在学习...");
        }

        void sayHi() {
            System.out.println("大家好，我叫" + this.name + "，今年" + this.age + "岁了，所在班级为" + this.className + "，学号为:" + this.stuId);
        }

        void playWith(String anotherName) {
            System.out.println(this.name + "正在和" + anotherName + "一起玩...");
        }
    }


    public static void main(String[] args) {

        Student zs = new Student();

        zs.name = "张三";
        zs.age = 24;
        zs.className = "jsd2302";
        zs.stuId = "001";

        zs.study();
        zs.sayHi();
        zs.playWith("李四");

        Student ls = new Student();
        ls.name = "李四";
        ls.age = 25;
        ls.className = "jsd2302";
        ls.stuId = "002";
        ls.study();
        ls.sayHi();
        ls.playWith("张三");

        Student ww = new Student();
        ww.study();
        ww.sayHi();
        ww.playWith("张三");




        Car car1 = new Car();
        car1.brand = "奔弛";
        car1.color = "黑";
        car1.price = 80;
        car1.start();
        car1.run();
        car1.stop();

        Car car2 = new Car("奥迪","银",40);
        car2.start();
        car2.run();
        car2.stop();

        Car car3 = new Car("特斯拉","白",70);
        car3.start();
        car3.run();
        car3.stop();

    }
    public static class Car {
        String brand;
        String color;
        double price;

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






}

