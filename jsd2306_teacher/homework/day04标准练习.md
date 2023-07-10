# 语言基础第四天标准练习：-----最少2遍

## 列表：

1. CommandBySwitch命令解析程序：

   要求：接收用户输入的命令，依据命令做不同的操作

2. Guessing猜数字之while版：

   要求：随机生成一个数，由用户来猜，猜不对则反复猜，并给出大小提示，猜对的则结束，用while来实现。

3. Guessing猜数字之do...while版

   要求：随机生成一个数，由用户来猜，猜不对则反复猜，并给出大小提示，猜对的则结束，用do...while来实现。

4. for循环：输出5次"行动是成功的阶梯"、输出9的乘法表(1到9、1/3/5/7/9、9到1)、累加1到100的和



## 参考：

1. CommandBySwitch命令解析程序：接收用户输入的命令，依据命令做不同的操作

   参考代码：

   ```java
   package day04;
   import java.util.Scanner;
   //命令解析程序
   public class CommandBySwitch {
       public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           System.out.println("请选择功能: 1.取款  2.存款  3.查询余额  0.退卡");
           int command = scan.nextInt();
   
           switch(command){
               case 1:
                   System.out.println("取款操作...");
                   break;
               case 2:
                   System.out.println("存款操作...");
                   break;
               case 3:
                   System.out.println("查询余额操作...");
                   break;
               case 0:
                   System.out.println("退出成功");
                   break;
               default:
                   System.out.println("输入错误");
           }
       }
   }
   ```

2. Guessing猜数字之while版：随机生成一个数，由用户来猜，猜不对则反复猜，并给出大小提示，猜对的则结束，用while来实现。

   参考代码：

   ```java
   package day04;
   import java.util.Scanner;
   //猜数字小游戏
   public class Guessing {
       public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           int num = (int)(Math.random()*1000+1); //1到1000之内
           System.out.println(num); //作弊
           
           //300(大),200(小),250(对)
           System.out.println("猜吧!");
           int guess = scan.nextInt(); //1.
           while(guess!=num){ //2.
               if(guess>num){
                   System.out.println("太大了");
               }else{
                   System.out.println("太小了");
               }
               System.out.println("猜吧!");
               guess = scan.nextInt(); //3.
           }
           System.out.println("恭喜你猜对了!");
       }
   }
   ```

3. Guessing猜数字之do...while版：随机生成一个数，由用户来猜，猜不对则反复猜，并给出大小提示，猜对的则结束，用do...while来实现。

   参考代码:

   ```java
   package day04;
   import java.util.Scanner;
   //猜数字小游戏
   public class Guessing {
       public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           int num = (int)(Math.random()*1000+1); //1到1000之内
           System.out.println(num); //作弊
   
           //假设num=250
           //300(大),200(小),250(对)
           int guess;
           do{
               System.out.println("猜吧!");
               guess = scan.nextInt(); //1+3
               if(guess>num){
                   System.out.println("太大了");
               }else if(guess<num){
                   System.out.println("太小了");
               }else{
                   System.out.println("恭喜你猜对了");
               }
           }while(guess!=num); //2
       }
   }
   ```

4. for循环：输出5次"行动是成功的阶梯"、输出9的乘法表(1到9、1/3/5/7/9、9到1)、累加1到100的和

   参考代码：

   ```java
   for(int times=0;times<5;times++){
       System.out.println("行动是成功的阶梯");
   }
   System.out.println("继续执行...");
   
   for(int num=1;num<=9;num++){
       System.out.println(num+"*9="+num*9);
   }
   for(int num=1;num<=9;num+=2){
       System.out.println(num+"*9="+num*9);
   }
   for(int num=9;num>=1;num--){
       System.out.println(num+"*9="+num*9);
   }
   
   //累加和:1+2+3+4+...+99+100=?
   int sum = 0; //和
   for(int i=1;i<=100;i++){
       sum = sum+i;
   }
   System.out.println("sum="+sum);
   ```
   
   
