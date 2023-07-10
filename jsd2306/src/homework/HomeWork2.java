package homework;

public class HomeWork2 {
    public static void main(String[] args) {
//
        System.out.println(5 % 2);
        System.out.println(8 % 2);
        System.out.println(2 % 8);
        int a = 5, b = 5;
        a--;
        --b;
        a++;
        ++b;
        int c = a++;
        int d = ++b;
        int e = --b;
        int f = a--;

        int a1 = 10, b1 = 9, c1 = 33;
        System.out.println(a1 > b1);
        System.out.println(b1 < c1);
        System.out.println(c1 >= b1);
        System.out.println(c1 <= b1);
        System.out.println(a1 == b1);
        System.out.println(c1 != a1);
        System.out.println(a1 + c1 > b1);

        int a2 = 5, b2 = 10, c2 = 5;
        System.out.println(a2 == c2 && a2 > b2);
        System.out.println(a2 > b2 && a2 == c2);
        System.out.println(a2 == c2 && b2 > a2);
        System.out.println(a2 > b2 && b2 == c2);

        System.out.println(a2 == c2 || a2 > b2);
        System.out.println(a2 > b2 || a2 == c2);
        System.out.println(a2 == c2 || b2 > c2);
        System.out.println(a2 != c2 || c2 > b2);

        System.out.println(!(a2 > b2));
        System.out.println(!(a2 == c2));

        boolean boolean1 = a2 > b2 && c2++ > 2;
        System.out.println(boolean1);
        System.out.println(c2);

        int a3 = 0;
        a3 += 1;
        a3 -= 1;
        a3 *= 1;
        a3 /= 1;
        a3 %= 1;

        short b3 = 5;
        a3 += 10;
        System.out.println(a3);
        a3 *= 2;
        System.out.println(a3);
        a3 /= 6;
        System.out.println(a3);

        int age = 30;
        String name = "qwq";
        System.out.println("我的名字是" + name + "，年龄是" + age);
        System.out.println(1 + 3 + 7 + "");
        System.out.println(3 + "" + 8 + 4);

        int num = 5;
        int flag = num > 0 ? 1 : 0;
        System.out.println(flag);

        int a4 = 8, b4 = 5;
        int max = a4 > b4 ? a4 : b4;
        System.out.println(max);

        double price = 900.00;
        if (price >= 500) {
            price *= 0.8;
        }
        System.out.println(price);

        int score = 100;
        if (score > 0 && score <= 100) {
            System.out.println("成绩合法");
        }


        if (price >= 500) {
            price *= 0.8;
        } else {
            price *= 0.9;
        }
        System.out.println(price);

        if (score > 0 && score <= 100) {
            System.out.println("成绩合法");
        } else {
            System.out.println("成绩不合法");
        }

        if (price >= 2000) {
            price *= 0.5;
        } else if (price >= 1000) {
            price *= 0.7;
        } else if (price >= 500) {
            price *= 0.8;
        } else {
            price *= 0.9;
        }
        System.out.println(price);
//
        int a5 = 1, b5 = 6;
        System.out.println(a5 > b5 ? a5 : b5);
        if (a5 > b5) {
            System.out.println(a5);
        } else {
            System.out.println(b5);
        }

        int year = 2023;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年是平年");
        }

        int score2 = 94;
        String score3;

        if (score2 >= 0 && score2 <= 100) {
            if (score >= 90) {
                score3 = "A";
            } else if (score2 >= 80 && score2 < 90) {
                score3 = "B";
            } else if (score2 >= 60 && score2 < 80) {
                score3 = "C";
            } else {
                score3 = "D";
            }
            System.out.println(score3);
        } else {
            System.out.println("成绩不合法");
        }


    }
}
