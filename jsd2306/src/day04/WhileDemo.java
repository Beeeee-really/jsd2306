package day04;

//while结构的演示
public class WhileDemo {
    public static void main(String[] args) {
//跑3圈
        int i = 1;
        while (i <= 3) {
            System.out.println("跑了" + i + "圈");
            i += 1;
        }
        System.out.println("----------------------------------------------");
//打印九九乘法表
        i = 1;
        int i2 = 1;
        while (i <= 9) {
            i2 = 1;
            while (i2 <= i) {
                System.out.print(" " + i + "*" + i2 + "=" + i * i2);//print不换行
                i2 += 1;
            }
            System.out.println("");//printin换行
            i += 1;
        }
        System.out.println("----------------------------------------------");
//输出5次‘行动是成功的阶梯’
        i = 1;
        while (i <= 5) {
            System.out.println("行动是成功的阶梯");
            i += 1;
        }
    }
}
