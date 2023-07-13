package BASICS.day06;

import java.util.Arrays;
public class ArrrayDemo_2 {
    public static void main(String[] args) {

//        6.数组的复制
//        1.
        int[] a = {10, 20, 30, 40, 50};
        int[] b = new int[6];//0,0,0,0,0,0

        System.arraycopy(a, 0, b, 1, 4);
        /*
        a:源数组
        1:原数组的起始下标
        b:目标数组
        0:目标数组的起始下标
        4:要复制的源数个数
        灵活性好
         */

        for (int i = 0; i < b.length; i += 1) {
            System.out.println(b[i]);
        }


        for (int i = 1; i <= 10000; i += 1) {
            System.out.print("-");
        }
        System.out.println();
//        2.
        int[] c = Arrays.copyOf(a, 6);
        /*
        a:源数组
        b:目标数组
        6:目标数组的长度
         --若目标数组长度大于原数组的长度，则末尾补零
         --若目标数组的长度小于原数组长度，则末尾截去
        灵活性差
         */

        for (int i = 0; i < c.length; i += 1) {
            System.out.println(c[i]);
        }

        int[] d = {10, 20, 30, 40, 50};
        d = Arrays.copyOf(d, d.length + 1);
        //数组的扩容:创建了一个更大的数组，回收原先的数组
        d= Arrays.copyOf(d,d.length-1);
        //数组的缩容:创建一个更小的数组，回收原先的数组

        for (int i = 0; i < d.length; i += 1) {
            System.out.println(d[i]);
        }
    }
}
