# 语言基础第三天扩展练习：

## 列表：

1. 声明两个整型变量a和b并分别赋值，找到a和b中的最大值，并输出。用两种方式实现：条件运算符、if..else分支结构。

2. 声明一个整型变量year并存储年份，判断其是平年还是闰年，若是闰年则输出"某某某年是闰年"，否则输出"某某某年是平年"。

   ```java
   /*
       闰年的判断公式:
       1)4年一闰，百年不闰，就是：能被4整除，并且，不能被100整除
         或者
       2)400年再闰，就是：能被400整除
   */
   ```

3. 成绩等级判断：

   > 注：考虑成绩的合法性：当不合法成绩时，输出"成绩不合法"

   ```java
   A:成绩大于等于90
   B:成绩大于等于80并且小于90
   C:成绩大于等于60并且小于80
   D:成绩小于60
   ```

   



## 参考：

1. 声明两个整型变量a和b并分别赋值，找到a和b中的最大值，并输出。用两种方式实现：条件运算符、if..else分支结构

   参考代码：

   ```java
   package test;
   public class Day03 {
       public static void main(String[] args) {
   		/*
           int a=8,b=5;
           int max = a>b?a:b;
           System.out.println("max="+max);
           */
           
           int a=8,b=5;
           int max;
           if(a>b){
               max = a;
           }else{
               max = b;
           }
           System.out.println("max="+max);
       }
   }
   ```

2. 声明一个整型变量year并存储年份，判断其是平年还是闰年，若是闰年则输出"某某某年是闰年"，否则输出"某某某年是平年"。

   参考代码：

   ```java
   package test;
   public class Day03 {
       public static void main(String[] args) {
   		/*
             闰年的判断公式:
             1)4年一闰，百年不闰，就是：能被4整除，并且，不能被100整除
               或者
             2)400年再闰，就是：能被400整除
            */
           int year = 2000; //年份  //带数(2021,2020,2000)
           if((year%4==0 && year%100!=0) || year%400==0){
               System.out.println(year+"是闰年");
           }else{
               System.out.println(year+"是平年");
           }
       }
   }
   ```

3. 成绩等级判断：

   > 注：考虑成绩的合法性：当不合法成绩时，输出"成绩不合法"

   参考代码：

   ```java
   int score = 95;
   //带数(888,-56,95,85,65,45)
   if(score<0 || score>100){
       System.out.println("成绩不合法");
   }else if(score>=90){ //合法
       System.out.println("A-优秀");
   }else if(score>=80){
       System.out.println("B-良好");
   }else if(score>=60){
       System.out.println("C-中等");
   }else{
       System.out.println("D-不及格");
   }
   ```

   
