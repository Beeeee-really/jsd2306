package day04;
//switch结构的演示
public class SwitchCaseDemo {
    public static void main(String[] args) {
        int num = 2;
        switch(num){ //byte,short,int,char,String,枚举
            case 1: //if(num==1)
                System.out.println(111);
                break;
            case 2: //以此为入口
                System.out.println(222);
                break; //跳出switch
            case 3:
                System.out.println(333);
                break;
            default: //所有case都未匹配时执行
                System.out.println(666);
        }
    }
}



















