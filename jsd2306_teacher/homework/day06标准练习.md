# 语言基础第六天标准练习：

## 列表：

1. MaxOfArray求数组元素最大值并放在最后一个元素的下一个位置
   
   要求：声明整型数组并填充随机数据，找到最大值，将数组扩容并将最大值放末尾
   
3. 方法的练习：
   
   要求：
   
   - 定义say()无参无返回值方法，调用测试
   - 定义say()有一个参无返回值方法，调用测试
   - 定义say()有两个参无返回值的方法，调用测试
   - 定义getNum()无参有返回值方法，演示return的用法，调用测试
   - 定义plus()两个参有返回值方法，调用测试
   - 定义generateArray()用于生成整型数组填充随机数并返回数组，调用测试
   
   

## 参考

1. MaxOfArray求数组元素最大值并放在最后一个元素的下一个位置：声明整型数组并填充随机数据，找到最大值，将数组扩容并将最大值放末尾

   参考代码：

   ```java
   package day06;
   import java.util.Arrays;
   //求数组元素的最大值，并将其放在最后一个元素的下一个位置
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
                   max = arr[i]; //则将max修改为较大的
               }
           }
           System.out.println("最大值为:"+max);
   
           arr = Arrays.copyOf(arr,arr.length+1); //扩容
           arr[arr.length-1] = max; //将最大值max放到最后一个元素上
           for(int i=0;i<arr.length;i++){
               System.out.println(arr[i]);
           }
       }
   }
   ```

3. 方法的练习：参数

   - 定义say()无参无返回值方法，调用测试
   - 定义say()有一个参无返回值方法，调用测试
   - 定义say()有两个参无返回值的方法，调用测试
   
   参考代码：
   
   ```java
   package day06;
   //方法的演示
   public class MethodDemo {
       public static void main(String[] args) {
           say();
           say("zhangsan"); //String name="zhangsan"
           say("zhangsan",25); //String name="zhangsan",int age=25
       }
       
       //无参无返回值
       public static void say(){
           System.out.println("大家好，我叫WKJ，今年38岁了");
       }
       
       //有参无返回值
       public static void say(String name){
           System.out.println("大家好，我叫"+name+"，今年38岁了");
       }
       
       //有参无返回值
       public static void say(String name,int age){
           if(age>=60){ //在某种特定条件下，提前结束方法
               return; //结束方法的执行
           }
           System.out.println("大家好，我叫"+name+"，今年"+age+"岁了");
       }
   }
   ```
   
3. 方法的练习：返回值

   - 定义getNum()无参有返回值方法，演示return的用法，调用测试
   - 定义plus()两个参有返回值方法，调用测试
   - 定义generateArray()用于生成整型数组填充随机数并返回数组，调用测试
   
   参考代码：
   
   ```java
   package day06;
   //方法的演示
   public class MethodDemo {
       public static void main(String[] args) {
           double a = getNum(); //getNum()值就是return后那个数
   		System.out.println(a); //8.88，模拟对返回值的后续操作
   
           int b = plus(5,6);
           System.out.println(b); //11，模拟对返回值的后续操作
           int m=5,n=6;
           int c = plus(m,n); //传递的是m和n里面的数
           System.out.println(c); //11，模拟对返回值的后续操作
   
           int[] d = generateArray(5,100); //模拟第1个人的访问
           System.out.println("数组的长度为:"+d.length); //10---模拟对返回值的后续操作
           for(int i=0;i<d.length;i++){ //---模拟对返回值的后续操作
               System.out.println(d[i]);
           }
   
           int[] e = generateArray(8,20); //模拟第2个人的访问
           System.out.println("第1个元素的值:"+e[0]); //?---模拟对返回值的后续操作
           for(int i=0;i<e.length;i++){ //---模拟对返回值的后续操作
               System.out.println(e[i]);
           }
       }
       
       //无参有返回值
       public static double getNum(){
           //return "abc"; //编译错误，返回值类型不匹配
           return 8.88; //1)结束方法的执行  2)返回结果给调用方
       }
       
       //有参有返回值
       public static int plus(int num1,int num2){
           int num = num1+num2;
           return num; //返回的是num里面的那个数
           //return num1+num2; //返回num1与num2的和
       }
       
       //无参有返回值
       public static int[] generateArray(int len,int max){
           Random rand = new Random();
           int[] arr = new int[len];
           for(int i=0;i<arr.length;i++){
               arr[i] = rand.nextInt(max+1);
           }
           return arr;
       }
   }
   ```

