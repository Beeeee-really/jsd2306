package day07;
import java.util.Scanner;
/**
 * 4.需求:机票价格按照季节(淡季、旺季)、舱位(头等舱、商务舱、经济舱)收费
 *   要求:
 *     输入机票原价、月份和舱位，实现不同的折扣
 *     ----旺季(5月到10月)时，头等舱9折，商务舱85折，经济舱8折
 *     ----淡季(11月到来年4月)时，头等舱7折，商务舱65折，经济舱6折
 *   训练目标: 分支结构
 */
public class CalAirPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        double price = scan.nextDouble();
        System.out.println("请输入月份:");
        int month = scan.nextInt();
        System.out.println("请选择舱位: 1.头等舱 2.商务舱 3.经济舱");
        int type = scan.nextInt();

        double finalPrice = calFinalPrice(price,month,type); //计算折扣后金额
        if(finalPrice!=-1){ //数据合法
            System.out.println("机票的最终价格为:"+finalPrice);
        }
    }

    //根据原价、月份、舱位，计算飞机票的最终价格t
    public static double calFinalPrice(double price,int month,int type){
        double finalPrice = 0.0; //最终价格
        //只要数据输入错误，都统一返回-1
        if(price<0){
            System.out.println("机票原价输入错误");
            return -1;
        }
        if(month<1 || month>12){
            System.out.println("月份输入错误");
            return -1;
        }
        if(type<1 || type>3){
            System.out.println("舱位输入错误");
            return -1;
        }

        //程序能走到这，说明数据一定是合法的
        if(month>=5 && month<=10){ //旺季
            switch(type){ //根据舱位类型做不同折扣
                case 1:
                    finalPrice = price*0.9;
                    break;
                case 2:
                    finalPrice = price*0.85;
                    break;
                case 3:
                    finalPrice = price*0.8;
                    break;
            }
        }else{ //淡季
            if(type==1){
                finalPrice = price*0.7;
            }else if(type==2){
                finalPrice = price*0.65;
            }else{
                finalPrice = price*0.6;
            }
        }

        return finalPrice;
    }
}

















