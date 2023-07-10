package BASICS.day03;

public class IfDemo {
    public static void main(String[] args) {
//        if else 嵌套 结构的演示
        // 满500打8折
        double price = 660.00;//消费金额
        if (price >= 500.00) {
            price *= 0.8;
            System.out.println("打折" + price);
        } else {
            System.out.println(":(");
        }

        int score = 90;//及格？
        if (score >= 60 && score <= 100) {
            if (score >= 90){
                System.out.println(":DDDDDD");
            }else{
                System.out.println(":)");
            }
                System.out.println(":)");
        } else {
            System.out.println(":(");
        }

    }
}
