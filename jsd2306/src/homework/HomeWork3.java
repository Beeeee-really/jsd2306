package homework;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
//        一.

//        1.

        System.out.println("输入：");
        Scanner scan = new Scanner(System.in);
        int command = scan.nextInt();

        switch (command) {
            case 1:
                System.out.println("111");
                break;
            case 2:
                System.out.println("222");
                break;
            case 3:
                System.out.println("333");
                break;
            case 4:
                System.out.println("444");
                break;
            default:
                System.out.println("999");
        }

//        2.
        int num = (int) (Math.random() * 1000);
        System.out.println(num);
        while (command != num) {
            System.out.println("猜数：");
            command = scan.nextInt();
            if (command < num) {
                System.out.println("小了");
            } else if (command > num) {
                System.out.println("大了");
            }
        }
        System.out.println("对了");

//        3.
        num = (int) (Math.random() * 1000);
        System.out.println(num);
        do {
            System.out.println("猜数：");
            command = scan.nextInt();
            if (command < num) {
                System.out.println("小了");
            } else if (command > num) {
                System.out.println("大了");
            } else {
                System.out.println("对了");
            }
        } while (command != num);


//        4.1.
        for (int i = 1; i <= 5; i += 1) {
            System.out.println("行动是成功的阶梯");
        }

//        4.2.
        for (int i = 1; i <= 9; i += 1) {
            System.out.println("9*" + i + "=" + (i * 9));
        }


//        4.3.
        int i2 = 0;
        for (int i = 1; i <= 100; i += 1) {
            i2 += i;
        }
        System.out.println(i2);


//        二.

//        1.
        System.out.println("输入：");
        num = scan.nextInt();
        if (num < 0) {
            System.out.println("-");
        } else if (num > 0) {
            System.out.println("+");
        } else {
            System.out.println("0");
        }


//        2.
        System.out.println("输入年份：");
        int years = scan.nextInt();
        System.out.println("输入月份：");
        int months = scan.nextInt();
        int days = 0;
        switch (months) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (years % 4 == 0 || years % 100 != 0) {
                    days = 29;
                } else {
                    days = 28;
                }
        }
        System.out.println(years + "的" + months + "月有" + days + "天");


//        3.
        years = 1900;
        int i3 = 0;
        for (int i = 1; i <= 2023 - years; i += 1) {
            if ((years % 4 == 0 && years % 100 != 0) && i3 <= 10) {
                System.out.print(years + "年是闰年,");
                i3 += 1;
            } else if ((years % 4 == 0 && years % 100 != 0) && i3 > 10) {
                System.out.println(years + "年是闰年,");
                i3 = 1;
            }
            years += 1;
        }
    }
}
