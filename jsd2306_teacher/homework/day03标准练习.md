# 语言基础第三天标准练习：

## 列表：

1. 运算符的练习：算术、关系、逻辑、赋值、字符串连接、条件
2. 分支结构的练习：if结构
3. 分支结构的练习：if...else结构
4. 分支结构的练习：if...else if结构



## 参考

1. 运算符的练习：算术

   - 输出几个整数取模，验证结果
   - 声明两个整型变量，演示单独使用时的自增和自减
   - 声明几个整型变量，演示被使用时的自增和自减
   
   参考代码：
   
   ```java
   System.out.println(5%2); //1，商2余1
   System.out.println(8%2); //0，商4余0----整除
   System.out.println(2%8); //2，商0余2
   
   //单独用----自增
   int a=5,b=5;
   a++; //相当于a=a+1
   ++b; //相当于b=b+1
   System.out.println(a); //6
   System.out.println(b); //6
   
   //单独用----自减
   int a=5,b=5;
   a--; //相当于a=a-1
   --b; //相当于b=b-1
   System.out.println(a); //4
   System.out.println(b); //4
   
   //被使用----自增
   int a=5,b=5;
   int c = a++; //1)将a++的值5赋值给c  2)a自增1变为6
   int d = ++b; //1)将++b的值6赋值给d  2)b自增1变为6
   System.out.println(a); //6
   System.out.println(b); //6
   System.out.println(c); //5
   System.out.println(d); //6
   
   //被使用----自减
   int a=5,b=5;
   int c = a--; //1)将a--的值5赋值给c  2)a自减1变为4
   int d = --b; //1)将--b的值4赋值为d  2)b自减1变为4
   System.out.println(a); //4
   System.out.println(b); //4
   System.out.println(c); //5
   System.out.println(d); //4
   ```
   
1. 运算符的练习：关系

   - 声明几个变量，演示最基本的>，<，>=，<=，==，!=操作
   - 演示关系运算符和算术运算符联合使用的效果
   
   参考代码：
   
   ```java
   int a=5,b=10,c=5;
   boolean b1 = b>a;
   System.out.println(b1);   //true
   System.out.println(c<b);  //true
   System.out.println(a>=c); //true
   System.out.println(b<=a); //false
   System.out.println(b==c); //false
   System.out.println(a!=c); //false
   
   System.out.println(a+c>10); //false
   System.out.println(b%2==0); //true
   System.out.println(c++>5);  //false------c自增1变为6
   System.out.println(c++>5);  //true-------c自增1变为7
   ```
   
1. 运算符的练习：逻辑

   - 声明三个整型变量，演示&&和||，演示!
     - &&的演示要求：true+false、false+true、true+true、false+false
     - ||的演示要求：true+false、false+true、true+true、false+false
     - !的演示要求：true、false
   - 演示短路&&与短路||
   
   参考代码：
   
   ```java
   int a=5,b=10,c=5;
   //演示&&
   boolean b1 = b>=a && b<c;
   System.out.println(b1);          //true&&false=false
   System.out.println(b<=c && b>a); //false&&true=false
   System.out.println(a==b && c>b); //false&&false=false
   System.out.println(b!=c && a<b); //true&&true=true
   //演示||
   System.out.println(b>=a || b<c); //true||false=true
   System.out.println(b<=c || b>a); //false||true=true
   System.out.println(b!=c || a<b); //true||true=true
   System.out.println(a==b || c>b); //false||false=false
   //演示!
   boolean b2 = !(a<b);
   System.out.println(b2);     //!true=false
   System.out.println(!(a>b)); //!false=true
   
   //演示&&的短路
   int a=5,b=10,c=5;
   boolean b3 = a>b && c++>2;
   System.out.println(b3); //false
   System.out.println(c);  //5，发生短路了
   
   //演示||的短路
   boolean b4 = a<b || c++>2;
   System.out.println(b4); //true
   System.out.println(c);  //5，发生短路了
   
   ```
   
1. 运算符的练习：赋值

   - 声明一个整型变量，演示扩展赋值+=、-=、*=、/=、%=的效果
   - 声明short型变量s，演示简单赋值运算的自增10，演示扩展赋值运算的自增10
   
   参考代码：
   
   ```java
   int a = 5;
   a += 10; //相当于a=(int)(a+10)
   System.out.println(a); //15
   a *= 2; //相当于a=(int)(a*2)
   System.out.println(a); //30
   a /= 6; //相当于a=(int)(a/6)
   System.out.println(a); //5
   
   short s = 5;
   //s = s+10; //编译错误，需强转，改为: s=(short)(s+10);
   s += 10; //相当于s=(short)(s+10)
   ```
   
1. 运算符的练习：字符串连接

   - 声明整型变量age和字符串型变量name，输出字符串连接的结果
   - 输出几个数据的拼接，演示字符串连接的同化作用
   
   参考代码：
   
   ```java
   //演示字符串连接
   int age = 38;
   System.out.println("age="); //age=
   System.out.println(age);    //38
   System.out.println("age="+age); //age=38
   System.out.println("我的年龄是"+age); //我的年龄是38
   System.out.println("我今年"+age+"岁了"); //我今年38岁了
   
   String name = "WKJ";
   System.out.println("name="+name); //name=WKJ
   System.out.println("大家好，我叫"+name); //大家好，我叫WKJ
   System.out.println("大家好，我叫"+name+"，今年"+age+"岁了"); //大家好，我叫WKJ，今年38岁了
   
   //演示同化作用
   System.out.println(10+20+""+30); //3030---------String
   System.out.println(""+10+20+30); //102030-------String
   System.out.println(10+20+30+""); //60-----------String
   ```
   
1. 运算符的练习：条件/三目

   - 声明并初始化整型变量，使用条件运算符实现：若>0则给flag赋值为1，否则赋值为0
   - 声明两个整型变量，使用条件运算符实现：求这两个变量的最大值
   
   参考代码：
   
   ```java
   int num = 5;
   int flag = num>0?1:-1;
   System.out.println(flag); //1
   
   int a=8,b=5;
   int max = a>b?a:b;
   System.out.println("max="+max);
   ```
   
7. 分支结构的练习：if

   - 满500打8折
   - 判断成绩是否合法

   参考代码：

   ```java
   //满500打8折:
   double price = 300.0; //消费金额  带数(600.0,300.0)
   if(price>=500){   //满500
       price *= 0.8; //打8折
   }
   System.out.println("最终消费金额为:"+price);
   
   //判断成绩是否合法
   int score = 555; //带数(95,-5,555)
   if(score>=0 && score<=100){
       System.out.println("成绩合法");
   }
   System.out.println("继续执行...");
   ```

3. 分支结构的练习：if...else

   - 满500打8折，不满500打9折
   - 判断成绩合法还是不合法
   
   参考代码：
   
   ```java
   //满500打8折，不满500打9折:
   double price = 300.0;   //带数(600.0,300.0)
   if(price>=500){ //满
       price*=0.8;
   }else{ //不满
       price*=0.9;
   }
   System.out.println("最终消费金额为:"+price);
   
   //判断成绩合法还是不合法
   int score = 95; //带数(95,-5,555)
   if(score>=0 && score<=100){
       System.out.println(score+"是合法成绩");
   }else{
       System.out.println(score+"是不合法成绩");
   }
   ```

9. 分支结构的练习：if...else if

   - 满2000打5折，满1000不满2000打7折，满500不满1000打8折，不满500打9折

   参考代码：

   ```java
   //满2000打5折，满1000不满2000打7折，满500不满1000打8折，不满500打9折:
   double price = 6000.0; //带数(2000.0,1000.0,600.0,300.0)
   if(price>=2000){
       price*=0.5;
   }else if(price>=1000){
       price*=0.7;
   }else if(price>=500){
       price*=0.8;
   }else{
       price*=0.9;
   }
   System.out.println("最终消费金额为:"+price);
   ```

   

