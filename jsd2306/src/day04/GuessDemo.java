package day04;

import java.util.Scanner;

public class GuessDemo {
    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);
        while (true) {
            int num = (int) (Math.random() * 10000);
            int scan1 = 0;
            /*

            while (scan1 != num) {
                System.out.println("猜数：(0 ~ 10000)");
                scan1 = scan.nextInt();
                if (scan1 != num) {

                    if (scan1 < num) {
                        System.out.println("小了");
                    } else {
                        System.out.println("大了");
                    }

                }
            }
            System.out.println("猜对啦！");

             */
            i = 1;
            while (i <= 100) {
                System.out.print("----");
                i += 1;
            }
            System.out.println("");
        }
    }
}
