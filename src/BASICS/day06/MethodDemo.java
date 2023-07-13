package BASICS.day06;

//方法的演示
public class MethodDemo {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHi("q w q w q w q w q w q w q w q w w q q");
        sayHi("张三");//实参

        int[] a = new int[1000];
        showArray(generateArrays(a));
        System.out.println(maxOfArray(a));

        sayHello("qwq", (int) (Math.random() * 10000000));//实参

        System.out.println(plus(1, 3));

        int n = 5, m = 6;
        int c = plus(n, m);
        System.out.println(c);

        overWhen60(67);
    }

    //无参数无返回值
    public static void sayHelloWorld() {
        System.out.println("hello world");
    }

    public static void sayHi(String name) {//形参
        System.out.println("我是" + name);
    }

    public static int maxOfArray(int[] a) {//形参
        int max = 0;
        for (int i = 0; i < a.length; i += 1) {
            max = a[i];
            for (int i2 = 0; i2 < a.length; i2 += 1) {
                if (max <= a[i2]) {
                    max = a[i2];
                }
            }
        }
        return max;//返回，return后需要一个数据。其类型必须与返回值类型相匹配
    }

    public static void sayHello(String name, int age) {//形参
        System.out.println("大家好，我叫" + name + "今年" + age + "岁了！");
    }

    public static void showArray(int[] a) {
        for (int i = 0; i < 10000; i += 1) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < a.length; i += 1) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < 10000; i += 1) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static int plus(int num1, int num2) {
        return (num1 + num2);
    }

    public static int[] generateArrays(int[] a) {
        for (int i = 0; i < a.length; i += 1) {
            a[i] = (int) (Math.random() * 10000);//rand.nextInt(100)  0~100随机数
        }
        return a;
    }

    public static void overWhen60(int a) {
        if (a > 60) {
            return;//提前结束方法
        }
        sayHello("www", 1414141);//方法可嵌套
    }

}
