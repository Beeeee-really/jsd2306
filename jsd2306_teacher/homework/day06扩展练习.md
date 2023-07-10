# 语言基础第六天扩展练习：

## 列表：

1. 定义一个方法getMaxOfArray()，用于获取数组元素的最大值，并返回，测试方法

2. 定义一个printArrayData()，用于输出整型数组的每一个元素的值，测试方法



## 参考：

1. 定义一个方法getMaxOfArray()，用于获取数组元素的最大值，并返回，测试方法

   参考代码：
   
   ```java
   package test;
   public class Day06 {
       public static void main(String[] args) {
   		int[] arr = {23,36,74,84,2,4};
           int max = getMaxOfArray(arr);
           System.out.println(max);
   
           int[] as = new int[10];
           for(int i=0;i<as.length;i++){
               as[i] = (int)(Math.random()*100);
           }
           int m = getMaxOfArray(as);
           System.out.println(m);
       }
       public static int getMaxOfArray(int[] arr){
           int max = arr[0]; //假设第1个元素为最大值
           for(int i=1;i<arr.length;i++){ //遍历剩余元素
               if(arr[i]>max){   //若剩余元素大于max
                   max = arr[i]; //将max修改为较大的
               }
           }
           return max;
       }
   }
   ```

2. 定义一个printArrayData()，用于输出整型数组的每一个元素的值，测试方法

   ```java
   package test;
   public class Day06 {
       public static void main(String[] args) {
   		int[] arr = {23,36,74,84,2,4};
           printArrayData(arr);
   
           Random rand = new Random();
           int[] as = new int[10];
           for(int i=0;i<as.length;i++){
               as[i] = rand.nextInt(100);
           }
           printArrayData(as);
       }
       public static void printArrayData(int[] arr){
           for(int i=0;i<arr.length;i++){
               System.out.println(arr[i]);
           }
       }
   }
   ```
   
   
