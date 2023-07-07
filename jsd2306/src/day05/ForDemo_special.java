package day05;

public class ForDemo_special {
    public static void main(String[] args) {
        int i = 1;
        for (; i <= 9; i += 1) {
            System.out.println("hello world");
        }


        for (i = 1; i <= 9; ) {
            System.out.println("hello world");
            i += 1;
        }
   /*
        for (; ; ) {//死循环
            System.out.println("hello world");
        }
*/

        for (int num = 1, j = 5; i <= 5; i += 1, j += 2) {
            System.out.println("hello world");
        }
    }
}
