package BASICS.day07;

import java.util.Scanner;

/**
 * 4.需求：机票价格按照季节（淡季、旺季）、舱位（头等舱、商务舱、经济舱）收费
 * <p>要求：
 * <p>输入机票原价、月份和舱位，实现不同的折扣
 * <p>-----旺季（5月到10月）时，头等舱9折，商务舱85折，经济舱8折
 * <p>-----淡季（11月到来年4月）时，头等舱7折，商务舱65折，经济舱6折
 * <p>训练目标：分支结构
 */
public class CalAirPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入机票原价");
        double price = scan.nextDouble();
        System.out.println("请输入月份：");
        int month = scan.nextInt();
        System.out.println("请输入舱位：1=头等舱 2=经济舱 3=商务舱");
        int type = scan.nextInt();

        double finalPrice = calAirPrice(price, month, type);
        if (finalPrice != -1.0) {//数据合法
            System.out.println(finalPrice);
        }

    }

    /**
     * 根据原价等计算机票最终价格
     * <p>------------------------------
     */
    public static double calAirPrice(double price, int month, int type) {

        double finalPrice = price;//最终价格
        switch (month) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                switch (type) {
                    case 1:
                        finalPrice *= 0.9;
                        break;
                    case 2:
                        finalPrice *= 0.8;
                        break;
                    case 3:
                        finalPrice *= 0.85;
                        break;
                    default:
                        finalPrice = -1;
                        System.out.println("error");
                        break;
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 11:
            case 12:
                switch (type) {
                    case 1:
                        finalPrice *= 0.7;
                        break;
                    case 2:
                        finalPrice *= 0.6;
                        break;
                    case 3:
                        finalPrice *= 0.65;
                        break;
                    default:
                        finalPrice = -1;
                        System.out.println("error");
                        break;
                }
                break;
            default:
                finalPrice = -1;
                System.out.println("error");
                break;
            /**
             * if(month<1 || type<3){
             *     switch(type){
             *         ...
             *    }
             * }
             */

        }
        return finalPrice;

    }

}

