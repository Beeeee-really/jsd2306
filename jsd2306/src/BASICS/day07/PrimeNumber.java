package BASICS.day07;

/**
 * 3.找到2到100之间所有的素数（质数）
 * <p>素数：只能被1和它本身整除的数
 * <p>训练目标：通过boolean的flag打标记（3步）
 */
public class PrimeNumber {
    public static void main(String[] args) {
        /*
        int num = 97;
        boolean flag = true;//1）假设num是素数
        for (int i = 2; i < num; i += 1) {//2到8
            if (num % i == 0) {
                flag = false;//2)修改为不是素数
                break;
            }
        }
        if (flag) {//3.判断boolean标记
            System.out.println(num + "是素数");
        } else {
            System.out.println(num + "不是素数");
        }

         */

        for (int num = 2; num <= 100; num += 1) {
            boolean flag = true;//1）假设num是素数
            for (int i = 2; i < num; i += 1) {//2到8
                if (num % i == 0) {
                    flag = false;//2)修改为不是素数
                    break;
                }
            }
            if (flag) {//3.判断boolean标记
                System.out.print(num + "\t");
            }
        }
    }
}
