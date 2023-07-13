package OOP.day04;

/**
 * 成员内部类
 * 类中套类
 * 内部类对象通常在会在外部类中创建
 * 内部类中可以访问外部类中的成员
 * 原因：在内部类中有个隐式
 */
public class Note {//外部类
    int a;//成员变量

    void show() {//成员方法
        Boo o = new Boo();
    }

    class Boo {//成员内部类

        void test() {
            System.out.println(a);//简写
            System.out.println(Note.this.a);//完整写法
        }
    }
}

class Test {
    public static void main(String[] args) {
        Note o1 = new Note();

    }
}
