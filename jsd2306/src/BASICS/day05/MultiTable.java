package BASICS.day05;

public class MultiTable {
    public static void main(String[] args) {
        /*
        \t
        水平制表位
         */
        for (int num = 1; num <= 9; num += 1) {
            for (int i = 1; i <= num; i += 1) {
                System.out.print(i + "*" + num + "=" + i * num + "\t");
            }
            System.out.println();
        }


//        ==
        System.out.println();

        int i = 1;
        int i2 = 1;
        while (i <= 9) {
            i2 = 1;
            while (i2 <= i) {
                System.out.print(i2 + "*" + i + "=" + i * i2 + "\t");//print不换行
                i2 += 1;
            }
            System.out.println("");//printin换行
            i += 1;
        }
    }
}
