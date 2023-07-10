package day06;

import java.util.Random;

//方法的演示
public class MethodDemo {
    public static void main(String[] args) {
        //say(); //调用say()方法

        /*
        //sayHi(); //编译错误，有参则必须传参
        //sayHi(250); //编译错误，参数类型必须匹配
        sayHi("zhangsan"); //String name="zhangsan"  //-------实参
        sayHi("lisi"); //String name="lisi" //----------------实参
         */

        //sayHello("zhangsan",25); //-------------------实参
        //sayHello("lisi",27); //-----------------------实参

        //double a = getNum(); //getNum()的值就是return后的那个数
        //System.out.println(a); //8.88---模拟对返回值的后续操作

        /*
        int b = plus(5,6);
        System.out.println(b); //11---模拟对返回值的后续操作

        int m=5,n=6;
        int c = plus(m,n); //传的是m,n里面的数
        System.out.println(c); //11---模拟对返回值的后续操作
        */

        /*
        int[] d = generateArray(5,100); //模拟第1个人的访问
        System.out.println("数组的长度为:"+d.length); //---模拟对返回值的后续操作
        for(int i=0;i<d.length;i++){ //---模拟对返回值的后续操作
            System.out.println(d[i]);
        }

        int[] e = generateArray(8,20); //模拟第2个人的访问
        System.out.println("第1个元素的值:"+e[0]); //---模拟对返回值的后续操作
        for(int i=0;i<e.length;i++){
            System.out.println(e[i]);
        }
         */

        //sayHello("zhangsan",22);
        //sayHello("lisi",66);

        //a(); //111,333,222,444
        //System.out.println(444);

        say(); //调用无参say方法
        say("zhangsan"); //调用String参say方法
        say("zhangsan",25); //调用String+int参say方法
    }

    //无参无返回值
    public static void say(){
        System.out.println("大家好，我叫WKJ，今年39岁了");
    }
    //有参无返回值
    public static void say(String name){ //--------------------形参
        System.out.println("大家好，我叫"+name+"，今年39岁了");
    }
    //有参无返回值
    public static void say(String name,int age){ //--------形参
        if(age>=50){ //在某种特定条件下，提前结束方法
            return; //结束方法
        }
        System.out.println("大家好，我叫"+name+"，今年"+age+"岁了");
    }

    public static void say(int age){ } //正确的重载
    public static void say(int age,String name){ } //正确的重载
    //public static int say(){ return 1; } //编译错误，重载与返回值类型无关
    //public static void say(String address){ } //编译错误，重载与参数名称无关


    public static void a(){
        System.out.println(111);
        b(); //方法的嵌套调用
        System.out.println(222);
    }
    public static void b(){
        System.out.println(333);
    }

    //生成一个整型数组，填充随机数据，并将数据返回
    public static int[] generateArray(int len,int max){
        Random rand = new Random();
        int[] arr = new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i] = rand.nextInt(max+1); //包括max
        }
        return arr;
    }

    //无参有返回值
    public static double getNum(){
        //return; //编译错误，return后必须跟一个数据
        //return "abc"; //编译错误，return后数据的类型必须与返回值类型匹配
        return 8.88; //1)结束方法的执行  2)返回结果给调用方
    }


}


















