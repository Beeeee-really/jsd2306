package BASICS.day06;

import java.util.Arrays;

public class MaxOfArray_2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i += 1) {
            arr1[i] = (int) (Math.random() * 100);
            System.out.println(arr1[i]);
        }
//        填充数据
        //最大值
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
/*
        //最小值
        int small = 0;
        for (int i2 = 0; i2 < arr1.length; i2 += 1) {
            small = arr1[i2];
            for (int i = 0; i < arr1.length; i += 1) {
                if (small >= arr1[i]) {
                    small = arr1[i];
                }
            }

        }
        System.out.println("最小值为" + small);
 */
    }
}
