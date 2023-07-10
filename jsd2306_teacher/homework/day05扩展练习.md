# 语言基础第五天扩展练习：

## 列表：

1. 利用for循环计算：求数字1到100之内，所有偶数的和，并输出

2. 利用for循环计算：求8的阶乘，并输出

3. 利用for循环计算：打印字符*组成的直角三角形，输出结果如下所示：

   ```java
   *
   ***
   *****
   *******
   *********
   ***********
   ```

4. 定义数组，包含10个元素，随机生成数据(范围自拟)，查找最大值和最小值，并输出

   

## 参考：

1. 利用for循环计算：求数字1到100之内，所有偶数的和，并输出

   参考代码：

   ```java
   package test;
   public class Day05 {
       public static void main(String[] args) {
   		int sum = 0;
           for(int i=2;i<=100;i+=2){
               sum+=i;
           }
           System.out.println("sum="+sum);
       }
   }
   ```

2. 利用for循环计算：求8的阶乘，并输出

   参考代码：

   ```java
   package test;
   public class Day05 {
       public static void main(String[] args) {
   		int num = 1; //阶乘
           for(int i=1;i<=8;i++){
               num*=i;
           }
           System.out.println("num="+num);
       }
   }
   ```

3. 利用for循环计算：打印字符*组成的等腰三角形，输出结果如下所示：

   ```java
   *
   ***
   *****
   *******
   *********
   ***********
   ```
   
   参考代码：
   
   ```java
   package test;
   public class Day05 {
       public static void main(String[] args) {
   		for(int i=1;i<=6;i++){
               for(int k=1;k<=2*i-1;k++){
                   System.out.print("*");
               }
               System.out.println();
           }
       }
   }
   ```

4. 定义数组，包含10个元素，随机生成数据(范围自拟)，查找最大值和最小值，并输出

   参考代码：

   ```java
   public class MaxOfArray {
       public static void main(String[] args) {
           int[] arr = new int[10];
           for(int i=0;i<arr.length;i++){
               arr[i] = (int)(Math.random()*100);
               System.out.println(arr[i]);
           }
           int max = arr[0];
           int min = arr[0];
           for(int i=1;i<arr.length;i++){ //遍历剩余元素
               if(arr[i]>max){   //若剩余元素大于max
                   max = arr[i]; //将max修改为较大的
               }
               if(arr[i]<min){
                   min = arr[i];
               }
           }
           System.out.println("最大值为:"+max+"，最小值为:"+min);
   
       }
   }
   ```

   
