package BASICS.day03;

public class IfElseIfDemo {
    public static void main(String[] args) {
        double price = 1000.00;
        if (price >= 2000) {
            System.out.println(price * 0.5);
        } else if (price >= 1000) {
            System.out.println(price * 0.7);
        } else if (price >= 500) {
            System.out.println(price * 0.8);
        } else {
            System.out.println(price * 0.9);
        }
    }
}
