package day04;
import java.util.Scanner;
//命令解析程序
public class CommandBySwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请选择功能: 1.存款 2.取款 3.查询余额 4.退卡");
        int command = scan.nextInt();

        switch(command){
            case 1:
                System.out.println("存款业务...");
                break;
            case 2:
                System.out.println("取款业务...");
                break;
            case 3:
                System.out.println("查询余额业务...");
                break;
            case 4:
                System.out.println("退卡成功");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
























