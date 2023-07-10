package BASICS.day02;

public class DataTypeDemo {
    public static void main(String[] args) {


        //int
        //1.int 整型 4个字节 -2^31到2^31-1（正负21多个亿）
        //2.int a = 3.14; 错误 int 仅存整数
        //3.int a = 100000000000000000000000000; 溢出
        int a = 25;
        System.out.println(5 / 2); // 2
        System.out.println(2 / 5); // 0
        System.out.println(5 / 2.0); // 2.5
        int d = 2147483647; // int 最大值
        d += 1; // 溢出 -2147483648 int的最小值 需要避免
        System.out.println(d);
        System.out.println(a);


        //long
        long a_3 = 25L; // 25L为长整型直接量
        // 2.long:长整型，8个字节，-2^63到2^63-1(正负900万万亿多)
        long a_4 = 25L; // 25L为长整型直接量
        // long b_1 = 10000000000;错误
        long c_1 = 10000000000L; // 100亿L为长整型直接量
        //long d = 3.14;// 错误，只能装整数

        long e_1 = 1000000000 * 2 * 10L;
        System.out.println(e_1);//200亿
        long f_1 = 1000000000L * 3 * 10;
        System.out.println(f_1);//不是300亿
        long g_1 = 1000000000L * 3 * 10;
        System.out.println(g_1);//300亿


        //double 浮点型 8个字节
        double a_2 = 5.14;// 3.14 位小数直接量，默认为double
        float b_5 = 3.14F;//3.14F为float直接变量
        System.out.println(3.0 - 2.9);//0.10000000000000009 //double与float 无法精确运算 精确场合不能使用double或float

        double c_0 = 3.0, d_2 = 2.9;
        System.out.println(c_0 - d_2);// 0.10000000000000009 有可能发生舍入误差


        //boolean 只能存true false 1个字节
        boolean a_6 = true;//true 是布尔型的直接量
        boolean b_1 = false;//false 是布尔型的直接量
        //boolean c_2=114;错误 布尔型只能存储true或false


        //char 2个字节 字符需放在单引号中 单引号中只能存储一个字符 Unicode编码格式：一个字符对应一个码 'a'97，'A'65','0'48
        char c1 = '女';
        char c2 = '男';
        char c8 = 65535;//0到65535之间 // c8为char；类型，所以会以类型形式形成
        System.out.println(c2);
        System.out.println(c1);
        System.out.println(c8);
        //char c3 = 's d s d s d s'错误
        //char c9 = ''';错误
        char c9 = '\''; //'
        //char c10 ='\';错误


        //String
        String y = "qwq";
        System.out.println(y);


        //变量的命名
        //System.out.println(q);变量未声明，错误
        int a_1, a_5, _3c, $5b; // 可声明
        //int ***1;带*，错误
        //int 12f: 开头为数字，错误
        //int class; 关键字，错误
        int ni_hao; // 拼音，可行，但不直观，杜绝

        /*
        byte-short-int-long-float-double  从小到大
             char————|
        自动类型转转唤 int a =5;  long b =a;//自动类型转换 //特殊情况 long d =5; //自动类型转换   double e =5;  //自动类型转换
        强制类型转换 int c = (int)b;//强制类型转换  //特殊情况 long f = 10000000000L;  int g =(int)f; //从大到小 强制转换 可能发生溢出
        double h =25.987;   int i =(int)h;  System.out.println(i);   //25,强转有可能丢失精度
        */


    }
}
