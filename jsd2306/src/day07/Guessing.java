package day07;


import java.util.Scanner;
/**
 * 1.猜数字小游戏
 *   训练目标：随机数
 */
public class Guessing {
    public static void main(String[] args) {
        //声明变量
        int num;
        int answer = 0;
        int turn;
        Scanner scan = new Scanner(System.in);
        //游戏主循环
        System.out.println("猜数字小游戏");
        while (true) {
            num = (int) (Math.random() * 1000);
            turn = 0;
            while (answer != num) {
                System.out.println("输入 数字 ：");
                answer = scan.nextInt();
                turn += 1;
                if (answer < num) {
                    System.out.println("小了");
                } else if (answer > num) {
                    System.out.println("大了");
                }
            }
            System.out.println("猜对了:)，你用了" + turn + "次");
            for (int i = 0; i < 10000; i += 1) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
