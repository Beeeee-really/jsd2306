package BASICS.day04;

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i += 1) {
            System.out.println("error");
        }

        /*
          执行过程
          i = 1    true   执行
          i = 2    true   执行
          i = 3    true   执行
          i = 4    true   执行
          i = 5    true   执行
          结束
          ------------------------------------------------------------------------------------
         */

        for (int i = 1; i <= 5; i += 1) {
            System.out.println("行动是成功的阶梯");
        }
        /*
          执行过程
          i = 1    true   执行
          i = 2    true   执行
          i = 3    true   执行
          i = 4    true   执行
          i = 5    true   执行
          结束
          --------------------------------------------------------------------------------------
         */

        for (int i = 1; i <= 9; i += 1) {
            System.out.println(i + "*9=" + i * 9);
        }
        /*
        ----------------------------------------------------------------------------------------
         */

        int i2 = 0;//存和
        for (int i = 1; i <= 100; i += 1) {
            i2 += i;
        }
        System.out.println(i2);
        /*
        执行过程
        i = 1    true   执行    i2 = 1
        i = 2    true   执行    i2 = 3
        i = 3    true   执行    i2 = 6
        i = 4    true   执行    i2 = 10
        ...
        i = 100  true   执行    i2 = 5050
        结束
         */
    }
}
