package day05;

import java.util.Scanner;

//随机加法运算器
public class Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0, answer, resault, num1, num2;
        while (true) {
            for (int i = 1, i2 = 1; i <= 10; i += 1, i2 += 1) {
                score = 0;
                num1 = (int) ((Math.random()) * 100);
                num2 = (int) ((Math.random()) * 100);
                System.out.println("(" + i2 + ")" + num1 + "+" + num2 + "=?");
                resault = num1 + num2;
                answer = scan.nextInt();
                if (answer == resault) {
                    System.out.println("答对了:D");
                    score += 10;
                } else {
                    System.out.println("答错了:((((((");
                }

            }
            System.out.println("你的分数是" + score);
            for (int i3 = 1; i3 <= 100; i3 += 1) {
                System.out.print("-");
            }
            System.out.println("");
        }
    }
}
