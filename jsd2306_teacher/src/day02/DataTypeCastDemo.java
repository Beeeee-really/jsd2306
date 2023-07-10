package day02;
//数据类型转换的演示
public class DataTypeCastDemo {
    public static void main(String[] args) {
        //两点规则:
        byte b1 = 5;
        byte b2 = 6;
        byte b3 = (byte)(b1+b2);

        System.out.println(2+2);     //4
        System.out.println(2+'2');   //52，2加上'2'的码50
        System.out.println('2'+'2'); //100，' 2'的码50，加上'2'的码50
        System.out.println('2'); //2，因为没有运算，所以输出的是字符2

        int a = 'a';
        System.out.println(a); //查看字符对应的码---97
        char c = 97;
        System.out.println(c); //查看码对应的字符---a





        /*
        //两种方式:
        int a = 5;
        long b = a; //自动类型转换
        int c = (int)b; //强制类型转换

        long d = 5; //自动类型转换
        double e = 5; //自动类型转换

        long f = 10000000000L;
        int g = (int)f;
        System.out.println(g); //1410065408，强转有可能发生溢出
        double h = 25.987;
        int i = (int)h;
        System.out.println(i); //25，强转有可能丢失精度
         */
    }
}


















