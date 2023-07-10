package day03;
//if...else结构的演示
public class IfElseDemo {
    public static void main(String[] args) {
        //1)满500打8折，不满500打9折:
        double price = 300.0;    //带数(600.0,300.0)
        if(price>=500){ //满
            price*=0.8;
        }else{ //不满
            price*=0.9;
        }
        System.out.println("最终消费金额为:"+price);

        //2)判断成绩合法还是不合法:
        int score = -9;   //带数(95,950,-9)
        if(score>=0 && score<=100){
            System.out.println(score+"是合法成绩");
        }else{
            System.out.println(score+"是不合法成绩");
        }

    }
}
















