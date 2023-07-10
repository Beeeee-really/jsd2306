# 语言基础第五天标准练习：

## 列表

1. Addition随机加法运算器

   要求：由系统随机出10道加法题，而后由用户来答题，答题后输出"答对了"或"答错了"，答对1题得10分，答错1题不扣分，最后输出总分数。

2. MultiTable九九乘法表

   要求：输出九九乘法表

3. 数组小代码练习：声明、初始化、访问、遍历

4. MaxOfArray求数组元素最大值

5. 对数组进行升序排列，并输出排序后的结果



## 参考

1. Addition随机加法运算器：由系统随机出10道加法题，而后由用户来答题，答题后输出"答对了"或"答错了"，答对1题得10分，答错1题不扣分,最后输出总分数。

   参考代码：

   ```java
   package day05;
   import java.util.Scanner;
   //随机加法运算器
   public class Addition {
       public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           int score = 0; //得分
           for(int i=1;i<=10;i++){ //10次    (1)25+36=?
               int a = (int)(Math.random()*100); //加数a(0到99的随机数)
               int b = (int)(Math.random()*100); //加数b(0到99的随机数)
               int result = a+b; //存正确答案
               System.out.println("("+i+")"+a+"+"+b+"=?"); //1)出题
               System.out.println("算吧!");
               int answer = scan.nextInt(); //2)答题
               if(answer==result){ //3)判题
                   System.out.println("答对了");
                   score+=10; //答对1题加10分
               }else{
                   System.out.println("答错了");
               }
           }
           System.out.println("总分为:"+score);
       }
   }
   ```

2. MultiType九九乘法表：输出九九乘法表

   参考代码：

   ```java
   package day05;
   //九九乘法表
   public class MultiTable {
       public static void main(String[] args) {
           for(int num=1;num<=9;num++){ //控制行
               for(int i=1;i<=num;i++){ //控制列
                   System.out.print(i+"*"+num+"="+i*num+"\t");
               }
               System.out.println(); //换行
           }
       }
   }
   ```

3. 数组小代码练习：声明

   - 定义至少两个数组，设计包含一些元素

   参考代码：

   ```java
   //声明整型数组arr，包含10个元素，每个元素都是int型，默认值为0
   int[] arr = new int[10];
   ```

4. 数组小代码练习：初始化

   - 定义至少三个数组，演示三种元素初始化方式

   参考代码：

   ```java
   //2)数组的初始化:--初始化的是数组中的数据
   int[] arr1 = new int[3]; //0,0,0
   int[] arr2 = {2,5,8}; //2,5,8
   int[] arr3 = new int[]{2,5,8}; //2,5,8
   int[] arr4;
   //arr4 = {2,5,8}; //编译错误，此方式只能声明同时初始化
   arr4 = new int[]{2,5,8}; //正确
   ```

5. 数组小代码练习：访问

   - 定义数组，输出数组的长度
   - 定义数组并分别给每个元素赋值，输出最后一个元素的值
   - 编写代码演示数组操作常见的异常----数组下标越界

   参考代码：

   ```java
   //3)数组的访问:--访问的是数组中的数据
   int[] arr = new int[3];
   System.out.println(arr.length); //3，输出arr的长度
   arr[0] = 100; //给arr中第1个元素赋值为100
   arr[1] = 200; //给arr中第2个元素赋值为200
   arr[2] = 300; //给arr中第3个元素赋值为300
   //arr[3] = 400; //运行时发生ArrayIndexOutOfBoundsException数组下标越界异常
   System.out.println(arr[arr.length-1]); //输出最后一个元素的值
   ```

6. 数组小代码练习：遍历

   - 定义数组，包含10个元素，遍历数组，给每个元素赋值为0到99之间的随机数，输出每个元素的值

   参考代码：

   ```java
   int[] arr = new int[10];
   for(int i=0;i<arr.length;i++){ //遍历arr数组
       arr[i] = (int)(Math.random()*100); //给每个元素赋值为0到99的随机数
       System.out.println(arr[i]); //输出每个元素的值
   }
   ```

7. MaxOfArray求数组元素最大值

   - 定义数组，包含10个元素，遍历数组，给每个元素赋值为0到99之间的随机数并输出，找到数组元素的最大值并输出

     参考代码：

     ```java
     public class MaxOfArray {
         public static void main(String[] args) {
             int[] arr = new int[10];
             for(int i=0;i<arr.length;i++){
                 arr[i] = (int)(Math.random()*100);
                 System.out.println(arr[i]);
             }
     		
             int max = arr[0]; //假设第1个元素为最大值
             for(int i=1;i<arr.length;i++){ //遍历剩余元素
                 if(arr[i]>max){   //若剩余元素大于max
                     max = arr[i]; //将max修改为较大的
                 }
             }
             System.out.println("最大值为:"+max);
         }
     }
     ```

8. 对数组进行升序排列，并输出排序后的结果

   参考代码：

   ```java
   int[] arr = new int[10];
   for(int i=0;i<arr.length;i++){
       arr[i] = (int)(Math.random()*100);
       System.out.println(arr[i]);
   }
   
   Arrays.sort(arr); //对arr数组做升序排列
   
   System.out.println("排序后:");
   for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]);
   }
   
   System.out.println("倒着输出:");
   for(int i=arr.length-1;i>=0;i--){ //数据还是升序的，只是倒着展示
       System.out.println(arr[i]);
   }
   System.out.println("第1个元素为:"+arr[0]);
   ```
