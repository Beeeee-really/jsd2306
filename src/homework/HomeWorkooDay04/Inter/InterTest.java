package homework.HomeWorkooDay04.Inter;

public class InterTest {
    public static void main(String[] args) {
        Inter o1 = new Inter() {
        };
        Inter o2 = new Inter() {
        };

        InterInter o3 = new InterInter() {
            public void show() {
                System.out.println("show1");
            }
        };
        o3.show();

        InterInter o4 = new InterInter() {
            public void show() {
                System.out.println("show2");
            }
        };
        o4.show();
    }
}
