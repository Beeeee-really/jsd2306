package BASICS.day04;

import java.util.Scanner;

//switch case结构演示
public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
        System.out.println("1~3");
        int num = scan.nextInt();
        switch (num) {//可用byte,short,int,char,String,枚举
            case 1://case不能重复
                System.out.println(111);
                break;
            case 2://以此为入口
                System.out.println(222);
                break;//跳出seitch
            case 3:
                System.out.println(333);
                break;
            default://可放于任何位置
                System.out.println("error");
            }
        }
    }
}
