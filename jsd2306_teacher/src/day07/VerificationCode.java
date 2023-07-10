package day07;

import java.util.Random;

/**
 * 2.需求:随机生成N位验证码(大写字母、小写字母、数字)
 *   训练目标:数组+方法+随机数
 */
public class VerificationCode {
    public static void main(String[] args) {
        String code = generateVeriCode(6);
        System.out.println("验证码:"+code);
    }

    /** 生成N位验证码 */
    public static String generateVeriCode(int len){
        String code = ""; //验证码
        Random rand = new Random(); //随机数对象
        char[] chs = {'a','b','c','d','e','f','g','h','i','j','k',
                      'l','m','n','o','p','q','r','s','t','u','v',
                      'w','x','y','z','A','B','C','D','E','F','G',
                      'H','I','J','K','L','M','N','O','P','Q','R',
                      'S','T','U','V','W','X','Y','Z','0','1','2',
                      '3','4','5','6','7','8','9'}; //验证码字符可选范围(共62个)
        for(int i=1;i<=len;i++){ //len次
            int index = rand.nextInt(chs.length); //随机下标(0到61)
            code += chs[index]; //根据随机下标获取对应字符并拼接到code中
        }
        return code;
        /*
                         code=""
          i=1  index=0   code="a"
          i=2  index=61  code="a9"
          i=3  index=25  code="a9z"
          i=4  index=28  code="a9zC"
          i=5
         */
    }
}














