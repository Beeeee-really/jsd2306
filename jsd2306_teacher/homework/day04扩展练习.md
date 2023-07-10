# 语言基础第四天扩展练习：

## 列表：

1. 接收用户输入的一个整数num，判断它的正负零值，正数则输出"+"，负数则输出"-"，0则输出"0"
2. 接收用户输入的年份year和月份month，计算该年该月的天数，并输出
4. 输出1900到2023年之间所有的闰年(每够10个年份，换一行)



## 参考：

1. 接收用户输入的一个整数num，判断它的正负零值，正数则输出"+"，负数则输出"-"，0则输出"0"

   参考代码：

   ```java
   package test;
   import java.util.Scanner;
   public class Day04 {
       public static void main(String[] args) {
   		Scanner scan = new Scanner(System.in);
           System.out.println("请输入一个整数:");
           int num = scan.nextInt();
   
           if(num>0){
               System.out.println("+");
           }else if(num<0){
               System.out.println("-");
           }else{
               System.out.println("0");
           }
       }
   }
   ```

2. 接收用户输入的年份year和月份month，计算该年该月的天数，并输出

   参考代码：

   ```java
   package test;
   import java.util.Scanner;
   public class Day04 {
       public static void main(String[] args) {
   		Scanner scan = new Scanner(System.in);
           System.out.println("请输入年份:");
           int year = scan.nextInt();
           System.out.println("请输入月份:");
           int month = scan.nextInt();
           int days = 0; //天数
           switch(month){
               case 1:
               case 3:
               case 5:
               case 7:
               case 8:
               case 10:
               case 12:
                   days = 31;
                   break;
               case 4:
               case 6:
               case 9:
               case 11:
                   days = 30;
                   break;
               case 2:
                   if((year%4==0 && year%100!=0) || year%400==0){
                       days = 29;
                   }else{
                       days = 28;
                   }
           }
           System.out.println(year+"年的"+month+"月共"+days+"天");
       }
   }
   ```

4. 输出1900到2023年之间所有的闰年(每够10个年份，换一行)

   参考代码：

   ```java
   int count=0;
   for(int year=1900;year<=2023;year++){
       if((year%4==0 && year%400!=0) || year%400==0){
           System.out.print(year+" ");
           count++;
           if(count%10==0){
               System.out.println();
           }
       }
   }
   ```

   
