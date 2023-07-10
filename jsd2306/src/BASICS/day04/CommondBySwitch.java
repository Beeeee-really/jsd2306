package BASICS.day04;

import java.util.Scanner;

//命令解析程序
public class CommondBySwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("选择：1~4");
            int command = scan.nextInt();
            int command2;
            switch (command) {
                case 1:
                    System.out.println("存储？是=1，否=2");
                    command2 = scan.nextInt();
                    if (command2 == 1) {
                        System.out.println("存储成功");
                    } else if (command2 == 2) {
                        continue;
                    } else {
                        System.out.println("error");
                        continue;
                    }
                    break;
                case 2:
                    System.out.println("取款？是=1，否=2");
                    command2 = scan.nextInt();
                    if (command2 == 1) {
                        System.out.println("取款成功");
                    } else if (command2 == 2) {
                        continue;
                    } else {
                        System.out.println("error");
                        continue;
                    }
                    break;
                case 3:
                    System.out.println("余额？是=1，否=2");
                    command2 = scan.nextInt();
                    if (command2 == 1) {
                        System.out.println("你的余额：0.00001");
                    } else if (command2 == 2) {
                        continue;
                    } else {
                        System.out.println("error");
                        continue;
                    }
                    break;
                case 4:
                    System.out.println("退卡？是=1，否=2");
                    command2 = scan.nextInt();
                    if (command2 == 1) {
                        System.out.println("退卡成功");
                    } else if (command2 == 2) {
                        continue;
                    } else {
                        System.out.println("error");
                        continue;
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
    }
}
