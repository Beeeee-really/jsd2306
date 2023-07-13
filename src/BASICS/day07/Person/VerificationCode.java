package BASICS.day07.Person;

import java.util.Random;

/**
 * 2.验证码生成
 * <p>训练目标：数组+方法+随机数
 */
public class VerificationCode {
    public static void main(String[] args) {
        System.out.println(generateVerificationCode(9));
    }

    public static String generateVerificationCode(int len) {
        String code = "";
        Random rand = new Random();
        char[] a = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i = 1; i <= len; i += 1) {
            int index = rand.nextInt(a.length);//随机下标
            code += a[index];
        }
        return code;
    }


    public static String generateVerificationCode_2(int len) {
        String code = "";

        return code;
    }
}