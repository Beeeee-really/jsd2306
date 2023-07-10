package BASICS.day04;

import java.util.Scanner;

//Sanner结构的演示
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//1.新建一个扫描仪，叫scan
        System.out.println("请输入年龄：");
        int age = scan.nextInt();//2.扫描一个整数并赋值给age
        System.out.println("年龄：" + age);
        System.out.println("商品价格：");//3.扫描一个小数并赋值给price
        double price = scan.nextDouble();
        System.out.println(price);
        System.out.println("输入你的名称：");
        String username = scan.next();//4.扫描一个字符串并赋值给username
        System.out.println("你的名称：" + username);

    }
}
