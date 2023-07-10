package day07;

/**
 * 3.需求:找到2到100之间的所有素数(质数)
 *       素数为只能被1和它本身整除的数
 *   训练目标:通过boolean的flag打标记(3步)+嵌套循环
 */
public class PrimeNumber {
    public static void main(String[] args) {
        for(int num=2;num<=100;num++){
            boolean flag = true; //1)假设每个num都是素数
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    flag = false; //2)修改为不是素数
                    break;
                }
            }
            if(flag){ //3.判断flag标记
                System.out.print(num+"\t");
            }
        }

        /*
           9%2/3/4/5/6/7/8时，9%3为0，说明它不是素数---但凡有1个为0的，就说明它不是素数
           7%2/3/4/5/6，全都不为0，说明它是素数--------只有都不为0的，才是素数
         */
        /*
        int num = 7; //7,11,8,9
        boolean flag = true; //1)假设num是素数
        for(int i=2;i<=num/2;i++){ //2到6
            if(num%i==0){
                flag = false; //2)修改为不是素数
                break;
            }
        }
        if(flag){ //3.判断flag标记
            System.out.println(num+"是素数");
        }else{
            System.out.println(num+"不是素数");
        }
         */
    }
}















