# 语言基础第二天标准练习：

## 列表：

1. 变量的练习：声明、初始化、使用、命名
2. 基本数据类型的练习：int、long、double、boolean、char
3. 类型间的转换：两种方式、两点规则



## 参考：

1. 变量的练习：
   
   - 声明一个变量，一次声明多个变量。
   - 声明变量直接初始化，先声明变量，而后再给变量初始化。
   - 声明整型变量g，声明另一个整型变量h并赋值为g+10，输出变量h的值。

   - 在g本身基础之上增10，输出变量g的值。
   - 声明一些正确的和错误的变量名。

   参考案例：
   
   ```java
   //变量的演示
   public class VarDemo {
       public static void main(String[] args) {
           //1)变量的声明:----相当于在银行开帐户
           int a; //声明一个整型的变量，名为a
           int b,c,d; //声明三个整型的变量，名为b,c,d
           //int a; //编译错误，变量不能同名
   
           //2)变量的初始化:----相当于给帐户存钱
           int e = 250; //声明整型变量e并赋值为250
           int f;   //声明整型变量f
           f = 250; //给f赋值为250
   
           //3)变量的使用:----使用的是帐户里面的钱
           int g = 5;
           int h = g+10; //取出g的值5，加10后，再赋值给变量h
           System.out.println(h); //输出变量h的值15
           System.out.println("h"); //输出h，双引号中的原样输出
           g = g+10; //在g本身基础之上增10
           System.out.println(g); //输出g的值15
   
           //int i = 3.14; //编译错误，数据类型必须匹配
           //System.out.println(j); //编译错误，变量j未声明
           int j;
           //System.out.println(j); //编译错误，变量j未初始化
   
           //4)变量的命名:
           int a1,a_5$,_3c,$_b;
           //int a*b; //编译错误，不能包含*号等特殊符号
           //int 1a; //编译错误，不能以数字开头
           int aa = 5;
           //System.out.println(aA); //编译错误，严格区分大小写
           //int class; //编译错误，不能使用关键字
   
           //int k; //不直观，不建议
           //int 年龄; //允许，但不建议
           //int nianLing; //既不直观也不专业，必须杜绝
           int age; //建议"英文的见名知意"
           int score,myScore,myJavaScore; //建议"小驼峰命名法"
   
       }
   }
   ```

2. 基本数据类型的练习：int

   - 声明初始化两个以上整数变量，并且输出两个整数变量的除法结果
   - 声明两个很大的变量，然后相加，输出运算结果，测试运算溢出现象

   参考案例：

   ```java
   //1)int:整型，4个字节，-21个多亿到21个多亿
   int a = 25; //25为整数直接量，默认为int类型
   //int b = 10000000000; //编译错误，100亿默认为int类型，但超出int范围了
   System.out.println(5/2);   //2
   System.out.println(2/5);   //0
   System.out.println(5/2.0); //2.5
   int c = 2147483647; //int的最大值
   c = c+1;
   System.out.println(c); //-2147483648(int的最小值)，发生溢出了，需要避免
   ```

3. 基本数据类型的练习：long

   - 声明初始化两个以上的长整型变量
   - 声明变量存储几个较大数据的运算，演示：若有可能溢出建议将L设计在第1个数字后。

   参考案例：

   ```java
   //2)long:长整型，8个字节，很大很大很大
   long a = 25L; //25L为长整型直接量，默认为long型
   //long b = 10000000000; //编译错误，100亿默认为int类型，但超出int范围了
   long c = 10000000000L; //100亿L为长整型直接量
   
   long d = 1000000000*2*10L;
   System.out.println(d); //200亿
   long e = 1000000000*3*10L;
   System.out.println(e); //不是300亿
   long f = 1000000000L*3*10;  //运算若有可能溢出，建议在第1个数字后加L
   System.out.println(f); //300亿
   ```

4. 基本数据类型的练习：double

   - 声明初始化两个以上的浮点型变量
   - 声明几个浮点型变量并将它们做数学操作，演示double运算的舍入误差问题

   参考案例：

   ```java
   //3)double:浮点型，8个字节，很大很大很大
   double a = 3.14159; //3.14159为浮点数直接量，默认为double类型
   float b = 3.14159F; //3.14159F为float型-----了解即可
   
   double c=3.0,d=2.9;
   System.out.println(c-d); //0.10000000000000009，有可能发生舍入误差
   ```

5. 基本数据类型的练习：boolean

   - 声明初始化两个以上的布尔型变量

   参考案例：

   ```java
   //4)boolean:布尔型，1个字节
   boolean a = true;  //true为布尔型直接量
   boolean b = false; //false为布尔型直接量
   //boolean c = 25; //编译错误，布尔型只能赋值为true或false
   ```

6. 基本数据类型的练习：char

   - 声明初始化五个以上的字符型变量
   - 声明字符型变量，演示转义符
   

参考案例：

```java
   //5)char:字符型，2个字节
   char c1 = '女'; //字符女
   char c2 = 'f';  //字符f
   char c3 = '6';  //字符6
   char c4 = '*';  //字符*
   //char c5 = 女; //编译错误，字符型直接量必须放在单引号中
   //char c6 = ''; //编译错误，必须有字符
   //char c7 = '女性'; //编译错误，只能有一个字符
   
   char c8 = '\\';
   System.out.println(c8);
```

7. 基本数据类型的转换：两种方式

   - 声明几个变量，演示自动类型转换和强制类型转换的语法
   - 声明一个较大类型的长整型变量，演示强转可能会发生的溢出问题
   - 声明一个较大精度的浮点型变量，演示强转可能会发生的丢失精度问题

   参考案例：

   ```java
   int a = 5;
   long b = a;     //自动类型转换
   int c = (int)b; //强制类型转换
   
   long d = 5; //自动类型转换
   double e = 5; //自动类型转换
   
   long f = 10000000000L;
   int g = (int)f;
   System.out.println(g); //1410065408，强转有可能发生溢出
   double h = 25.987;
   int i = (int)h;
   System.out.println(i); //25，强转有可能丢失精度
   ```

8. 基本数据类型的转换：两点规则

   - 声明两个byte型变量b1和b2，并赋值为直接量
   - 声明一个byte型变量，并赋值为b1与b2的和

   参考案例：

   ```java
   byte b1 = 5;
   byte b2 = 6;
   byte b3 = (byte)(b1+b2);
   
   System.out.println(2+2);     //4
   System.out.println(2+'2');   //52，2加上'2'的码50
   System.out.println('2'+'2'); //100，'2'的码50，加上'2'的码50
   ```

