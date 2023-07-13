package BASICS.day05;

public class BreakContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i += 1) {
            if (i == 4) {
                break;
            }
            System.out.println("9*" + i + "=" + (9 * i));
        }


        for (int i = 1; i <= 9; i += 1) {
            if (i == 4) {
                continue;
            }
            System.out.println("9*" + i + "=" + (9 * i));
        }

//        ==

        for (int i = 1; i <= 9; i += 1) {
            if (i == 4) {

            } else {
                System.out.println("9*" + i + "=" + (i * 9));
            }
        }
    }
}
