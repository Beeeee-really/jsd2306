package homework;

import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {
//        1.
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i += 1) {
            arr1[i] = (int) (Math.random() * 100);
            System.out.println(arr1[i]);
        }


        int Max = 0;
        for (int i2 = 0; i2 < arr1.length; i2 += 1) {
            Max = arr1[i2];
            for (int i = 0; i < arr1.length; i += 1) {
                if (Max <= arr1[i]) {
                    Max = arr1[i];
                }
            }

        }
        System.out.println("最大值为" + Max);

        arr1 = Arrays.copyOf(arr1, arr1.length + 1);
        arr1[arr1.length - 1] = Max;

        for (int i = 0; i < arr1.length; i += 1) {
            System.out.println(arr1[i]);
        }

//        2.
        say();
        say(2);
        say(1, 2);
        getNum();
        plus(1, 4);
        int[] a = generateArray(99);
        for (int i = 0; i < a.length; i += 1) {
            System.out.println(a[i]);
        }


        //        1.
        arr1 = new int[10];
        for (int i = 0; i < arr1.length; i += 1) {
            arr1[i] = (int) (Math.random() * 100);
            System.out.println(arr1[i]);
        }


        Max = 0;
        for (int i2 = 0; i2 < arr1.length; i2 += 1) {
            Max = arr1[i2];
            for (int i = 0; i < arr1.length; i += 1) {
                if (Max <= arr1[i]) {
                    Max = arr1[i];
                }
            }

        }
        System.out.println("最大值为" + Max);

        arr1 = Arrays.copyOf(arr1, arr1.length + 1);
        arr1[arr1.length - 1] = Max;

        for (int i = 0; i < arr1.length; i += 1) {
            System.out.println(arr1[i]);
        }

//        2.
        say();
        say(2);
        say(1, 2);
        getNum();
        plus(1, 4);
        a = generateArray(99);
        for (int i = 0; i < a.length; i += 1) {
            System.out.println(a[i]);
        }
    }

    //    2.
    public static void say() {
        System.out.println();
    }


    public static void say(int a) {
        System.out.println(a);
    }


    public static void say(int a, int b) {
        System.out.println(a + b);
    }


    public static int getNum() {
        return (int) (Math.random() * 100);
    }


    public static int plus(int a, int b) {
        return a + b;
    }


    public static int[] generateArray(int a) {
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i += 1) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    //    2.
    public static void say2() {
        System.out.println();
    }


    public static void say2(int a) {
        System.out.println(a);
    }


    public static void say2(int a, int b) {
        System.out.println(a + b);
    }


    public static int getNum2() {
        return (int) (Math.random() * 100);
    }


    public static int plus2(int a, int b) {
        return a + b;
    }


    public static int[] generateArray2(int a) {
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i += 1) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
