package day03;

public class IfElseDemo {
    public static void main(String[] args) {
        double price = 600.00;
        if (price >= 500.00) {
            System.out.println(0.8 * price);

        } else {
            System.out.println(0.9 * price);

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
