package OOP.day03;

//接口的演示
public class InterfaceDemo {

    public static void main(String[] args) {

    }
}

//接口的语法
interface Inter {//接口不能被实例化(new)

    //抽象方法
    abstract void show();//接口中的方法默认都是抽象的，前面默认有abstract

    void test();
    //void say(){}//错误，抽象方法不能有方法体
}

abstract class Aoo {

}


//演示接口的实现
class InterImpl implements Inter {
    public void show() {//重写接口中的抽象方法，必须加public

    }

    public void test() {

    }
}

//演示接口的多实现
interface Inter1 {
    void show();
}

interface Inter2 {
    void test();
}

abstract class Boo {
    abstract void say();
}

class Coo extends Boo implements Inter1, Inter2 {
    public void show() {
    }

    public void test() {
    }

    public void say() {

    }
}

interface Intr3 {
    void show();
}

interface Inter4 {
    void test();
}

class Doo implements Inter4 {
    public void test() {
    }

    public void show() {
    }
}

