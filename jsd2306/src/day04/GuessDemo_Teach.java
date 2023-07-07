package day04;

import java.util.Scanner;

//猜数字小游戏
public class GuessDemo_Teach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int) (Math.random() * 1000); //手里藏的数
        System.out.println(num);

        int guess;
        do {
            System.out.println("猜数：");
            guess = scan.nextInt();
            if (guess < num) {
                System.out.println("小");
            } else if (guess > num) {
                System.out.println("大");
            }
        } while (guess != num);
        System.out.println("对了");
        //300,200,251,250

        /*
        System.out.println("猜吧!");
        int guess = scan.nextInt(); //1.

        while(guess!=num){ //2.
            System.out.println("猜吧!");
            guess = scan.nextInt(); //3.

        }
        System.out.println("恭喜你猜对了!");

         */
    }
}








