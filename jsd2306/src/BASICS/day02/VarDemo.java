package BASICS.day02;

//变量的演示
public class VarDemo {
    public static void main(String[] args) {
        int a; //声明一个整形的变量
        int b, c, d, e; //声明多个整形的变量
        int f; //声明并初始化一个整形的变量 f 为 1919
        int g = 1, h = 5, i = 5, j = 4, k = 1;

        // 变量初始化
        a = 114;// 给变量 a 赋值为 114
        b = 1212;
        c = 999;
        d = 1212;
        e = 1313;
        f = 3333;

        // 变量的访问
        int l = 5;
        int m = l + 10;// 取出l的值，加上10后，再赋值给m
        System.out.println(l);
        System.out.println(m);
        l += 10;
        System.out.println(l);

        int balanse = 5000;
        balanse -= 1000;
        System.out.println(balanse);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);





    }
}
