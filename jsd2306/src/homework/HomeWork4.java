package homework;

import java.util.Scanner;
import java.util.Arrays;

public class HomeWork4 {
    public static void main(String[] args) {
//        一.
//        1.
        Scanner scan = new Scanner(System.in);
        int score = 0, answer, result, num1, num2;
        for (int i = 1, i2 = 1; i <= 10; i += 1, i2 += 1) {
            score = 0;
            num1 = (int) ((Math.random()) * 100);
            num2 = (int) ((Math.random()) * 100);
            System.out.println("(" + i2 + ")" + num1 + "+" + num2 + "=?");
            result = num1 + num2;
            answer = scan.nextInt();
            if (answer == result) {
                System.out.println("答对了:D");
                score += 10;
            } else {
                System.out.println("答错了:((((((");
            }

        }
        System.out.println("你的分数是" + score);
        for (int i3 = 1; i3 <= 100; i3 += 1) {
            System.out.print("-");
        }
        System.out.println();


//        2.
        for (int num = 1; num <= 9; num += 1) {
            for (int i = 1; i <= num; i += 1) {
                System.out.print(i + "*" + num + "=" + i * num + "\t");
            }
            System.out.println();
        }


//        3.
        int[] arr = new int[10];
        int[] arr1 = new int[]{1, 2, 3};
        System.out.println(arr[1]);
        for (int i = 0; i < arr.length; i += 1) {
            System.out.println(arr[i]);
        }


//        4.

        for (int i = 0; i < arr.length; i += 1) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);//对arr6数组做升序的排列

        System.out.println("升序后：");
        for (int i = 0; i < arr.length; i += 1) {
            System.out.println(arr[i]);
        }
//        5.
        System.out.println("倒着输出：");
        for (int i = arr.length - 1; i >= 0; i -= 1) {
            System.out.println(arr[i]);
        }

//        二.
//        1.
        int num = 0;
        for (int i = 2; i <= 100; i += 2) {
            num += i;
        }
        System.out.println(num);


//        2.
        int num3 = 1;
        for (int i = 1; i <= 8; i += 1) {
            num3 *= i;
        }
        System.out.println(num3);

//        3.
        for (int i = 1; i <= 6; i += 1) {
            for (int i2 = 1; i2 <= i; i2 += 1) {
                System.out.print("*");
            }
            System.out.println();
        }


//        4.
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i += 1) {
            arr2[i] = (int) (Math.random() * 100);
            System.out.println(arr2[i]);
        }
        int max = 0;
        for (int i = 0; i < arr2.length; i += 1) {
            max = arr2[i];
            for (int i2 = 0; i2 < arr2.length; i2 += 1) {
                if (max < arr2[i2]) {
                    max = arr2[i2];
                }
            }
        }
        System.out.println("最大值：" + max);
        Arrays.sort(arr2);
        System.out.println("最小值：" + arr2[0]);
    }
}

