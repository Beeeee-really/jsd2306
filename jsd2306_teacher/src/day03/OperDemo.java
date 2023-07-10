package day03;
//运算符的演示
public class OperDemo {
    public static void main(String[] args) {
        /*
          6.条件运算符:
            1)语法:
                boolean?数1:数2
            2)执行过程:
                整个条件运算是有值的，它的值要么是?号后的数1，要么是:号后的数2
                计算boolean的值:
                  若为true，则整个表达式的值为?号后的数1
                  若为false，则整个表达式的值为:号后的数2
         */
        int num = 5;
        int flag = num>0?1:-1;
        System.out.println(flag); //1

        int a=8,b=5;
        int max = a>b?a:b;
        System.out.println("max="+max);

        /*
          5.字符串连接运算符:
            1)+:
              1.1)若两边为数字，则做加法运算
              1.2)若两边(任意边)出现了字符串，则做字符串连接
              1.3)任何类型的数据与字符串连接，结果都会变为字符串类型
         */
        /*
        int age = 39;
        System.out.println("age="); //age=
        System.out.println(age);    //39
        System.out.println("age="+age); //age=39
        System.out.println("我今年"+age+"岁了"); //我今年39岁了
        String name = "WKJ";
        System.out.println("大家好，我叫"+name); //大家好，我叫WKJ
        System.out.println("大家好，我叫"+name+"，今年"+age+"岁了"); //大家好，我叫WKJ，今年39岁了
        System.out.println("------------------------------");

        System.out.println(10+20+""+30); //3030----------String
        System.out.println(""+10+20+30); //102030--------String
        System.out.println(10+20+30+""); //60------------String
        */








        /*
          4.赋值运算符:
            1)简单赋值运算符:=
            2)扩展赋值运算符:+=、-=、*=、/=、%=
              ---扩展赋值运算自带强转功能
         */
        /*
        //小面试题:
        short s = 5;
        //s = s+10; //编译错误，需强转，改为:s=(short)(s+10);
        s += 10; //相当于s=(short)(s+10);

        int a = 5;
        a += 10; //相当于a=(int)(a+10)
        System.out.println(a); //15
        a *= 2; //相当于a=(int)(a*2)
        System.out.println(a); //30
        a /= 6; //相当于a=(int)(a/6)
        System.out.println(a); //5
        */
















        /*
          3.逻辑运算符:
            1)&&:短路与(并且)，两边都为真则为真，见false则false
                 ---当第1个条件为false时，则发生短路(后面的不执行了)
              ||:短路或(或者)，有真则真，见true则true
                 ---当第1条件为true时，则发生短路(后面的不执行了)
               !:逻辑非(取反)，非真则假，非假则真
            2)逻辑运算符是建立在关系运算的基础之上的，
              逻辑运算的结果也是boolean型
         */
        /*
        int a=5,b=10,c=5;
        boolean b3 = a>b && c++>2;
        System.out.println(b3); //false
        System.out.println(c);  //5，发生短路了

        boolean b4 = a<b || c++>2;
        System.out.println(b4); //true
        System.out.println(c);  //5，发生短路了
        */

        /*
        boolean b1 = b>=a && b<c;
        System.out.println(b1);          //true&&false=false
        System.out.println(b<=c && b>a); //false&&true=false
        System.out.println(a==b && c>b); //false&&false=false
        System.out.println(b!=c && a<b); //true&&true=true
        int age = 39;
        System.out.println(age>=18 && age<=50); //年龄在18到50之间
        int score = 86;
        System.out.println(score>=0 && score<=100); //成绩在0到100之间

        System.out.println(b>=a || b<c); //true||false=true
        System.out.println(b<=c || b>a); //false||true=true
        System.out.println(b!=c || a<b); //true||true=true
        System.out.println(a==b || c>b); //false||false=false
        int score = 95;
        System.out.println(score<0 || score>100); //成绩不合法验证(不在0到100之间)

        boolean b2 = !(a<b);
        System.out.println(b2);     //!true=false
        System.out.println(!(a>b)); //!false=true
        */
























        /*
          2.关系运算符:
            1)>(大于)、<(小于)
              >=(大于或等于)、<=(小于或等于)
              ==(等于)、!=(不等于)
            2)关系运算的结果为boolean型，关系成立则为true，关系不成立则为false
         */
        /*
        int a=5,b=10,c=5;
        boolean b1 = a>b;
        System.out.println(b1);   //false
        System.out.println(c<b);  //true
        System.out.println(a>=c); //true
        System.out.println(a<=b); //true
        System.out.println(a==c); //true
        System.out.println(a!=c); //false
        System.out.println(a%2==0); //false
        System.out.println(a+c>b);  //false
        System.out.println(a++>5);  //false-------a自增1变为6
        System.out.println(a++>5);  //true--------a自增1变为7
        System.out.println(a);      //7
        */












        /*
          1.算术运算符: +、-、*、/、%、++、--
            1)%:取模/取余，余数为0即为整除
            2)++/--:自增1/自减1，可在变量前也可在变量后
              2.1)单独使用时，在前在后都一样
              2.2)被使用时，在前在后不一样
                    a++的值为a-----------------(a--的值为a)
                    ++a的值为a+1---------------(--a的值为a-1)
         */
        /*
        int a=5,b=5;
        int c = a--; //将a--的值5赋值给c，同时a自减1变为4
        int d = --b; //将--b的值4赋值给d，同时b自减1变为4
        System.out.println(a); //4
        System.out.println(b); //4
        System.out.println(c); //5
        System.out.println(d); //4
         */
        /*
        int a=5,b=5;
        a--; //相当于a=a-1
        --b; //相当于b=b-1
        System.out.println(a); //4
        System.out.println(b); //4
        */











        /*
        int a=5,b=5;
        int c = a++; //将a++的值5赋值给c，同时a自增1变为6
        int d = ++b; //将++b的值6赋值给d，同时b自增1变为6
        System.out.println(a); //6
        System.out.println(b); //6
        System.out.println(c); //5
        System.out.println(d); //6
         */
        /*
        int a=5,b=5;
        a++; //相当于a=a+1
        ++b; //相当于b=b+1
        System.out.println(a); //6
        System.out.println(b); //6
        */











        /*
        System.out.println(5%2); //1，商2余1
        System.out.println(8%2); //0，商4余0----整除
        System.out.println(2%8); //2，商0余2
         */
    }
}


















