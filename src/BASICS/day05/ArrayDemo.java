package BASICS.day05;

import java.util.Arrays;

//数组的演示
public class ArrayDemo {
    public static void main(String[] args) {

        //1.数组的定义
        int[] a = new int[5];//声明整形的数组a，包含10个元素，它们都是int型，元素有默认值为0
        double[] d = new double[10];//默认值为0.0
        boolean[] b = new boolean[26];//默认值为false
        /*
        byte,short,int,long,char----默认值为0
        float,double----------------默认值为0.0
        boolean---------------------默认值为false
         */

        //2.数据的初始化：初始化数据中的元素
        int[] arr1 = new int[3];//0,0,0
        int[] arr2 = {2, 5, 8};//2,5,8
        int[] arr3 = new int[]{2, 5, 8};//2,5,8
        int[] arr4 = new int[3];
        //arr4 = {2, 5, 8};错误，只能在声明时初始化

        //3.数据的访问
        /*
        1)通过(数组名.length)可获得数组的长度
        2)通过下标/索引来访元素，下表从0开始，最大到(数组的长度-1)
         */
        int[] arr = new int[300000000];
        System.out.println("数组的长度:" + arr.length);//3

        arr[1] = 100;
        System.out.println(arr[1]);
        //更改数组中元素的数值

        System.out.println(arr[0]);//输出第1个元素
        arr[0] = 100;//给第1个元素赋值为100
        arr[1] = 200;//给第2个元素赋值为200
        arr[2] = 300;//给第3各元素赋值为300
        arr[arr.length - 1] = 100;//给最后一个元素赋值为100
        System.out.println(arr[arr.length - 1]);

        //4.数组的遍历/迭代
        int[] arr5 = new int[10];
        for (int i = 0; i < arr5.length; i += 1) {
            arr5[i] = (int) (Math.random() * 100);
            System.out.println(arr5[i]);
        }

        //5.数据的排序
        int[] arr6 = new int[10];
        for (int i = 0; i < arr6.length; i += 1) {
            arr6[i] = (int) (Math.random() * 100);
            System.out.println(arr6[i]);
        }

        Arrays.sort(arr6);//对arr6数组做升序的排列

        System.out.println("升序后：");
        for (int i = 0; i < arr6.length; i += 1) {
            System.out.println(arr6[i]);
        }


        System.out.println("倒着输出：");
        for (int i = arr6.length - 1; i >= 0; i -= 1) {
            System.out.println(arr6[i]);
        }
    }
}
