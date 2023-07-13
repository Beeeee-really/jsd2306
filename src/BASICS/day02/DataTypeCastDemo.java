package BASICS.day02;

public class DataTypeCastDemo {
    public static void main(String[] args) {
        int a = 5;
        long b = a;//自动类型转换
        int c = (int) b;//强制类型转换

        long d = 5;
        double e = 5;//自动类型转换

        long f = 10000000000L;
        int g = (int) f;
        System.out.println(g);

        double h = 25.987;
        int i = (int) h;//强制转换
        System.out.println(i);//丢失精度

        byte b1 = 5;//5为直接量
        //byte b2= 800;//错误。超出范围


        byte a1 =5;
        byte a2 =6;
        byte a3 = (byte)(a1 + a2);

        System.out.println(2+2);
        System.out.println('2'+'2');


    }
}
