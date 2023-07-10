package day04;
import java.util.Scanner;
//猜数字小游戏
public class Guessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int)(Math.random()*1000+1); //1到1000之内的随机数
        System.out.println(num); //作弊

        //假设num=250
        //300(大),200(小),250(对)
        int guess;
        do{
            System.out.println("猜吧!");
            guess = scan.nextInt();  //1+3
            if(guess>num){
                System.out.println("太大了");
            }else if(guess<num){
                System.out.println("太小了");
            }else{
                System.out.println("恭喜你猜对了!");
            }
        }while(guess!=num); //2









        /*
        //300(大),200(小),250(对)
        System.out.println("猜吧!");
        int guess = scan.nextInt(); //1.
        while(guess!=num){ //2.
            if(guess>num){
                System.out.println("太大了");
            }else{
                System.out.println("太小了");
            }
            System.out.println("猜吧!");
            guess = scan.nextInt(); //3.
        }
        System.out.println("恭喜你猜对了!");
         */
    }
}



















