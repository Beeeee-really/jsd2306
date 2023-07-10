package day05;
//求数组元素的最大值
public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
            System.out.println(arr[i]);
        }

        //下标:               0  1  2 3
        //假设: int[] arr = {12,56,89,8};
        //max=12/56/89
        int max = arr[0]; //假设第1个元素为最大值
        for(int i=1;i<arr.length;i++){ //遍历剩余元素
            if(arr[i]>max){ //若剩余元素大于max
                max = arr[i]; //将max修改为较大的
            }
        }
        System.out.println("最大值为:"+max);

    }
}












