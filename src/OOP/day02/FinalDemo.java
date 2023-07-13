  package OOP.day02;

 /**
 * final 的演示
 */
public class FinalDemo {
}
//演示final修饰变量
class Eoo{
    final int a = 5;
    int b=6;
    void test(){
        //a = 55;//错误 final修饰的变量不能再改变
        b = 66;
        final int c =8;
        //c = 88;//错误 final修饰的变量不能再修改
    }
}


//final修饰方法
class Foo{
    final void show(){}
    void test(){}
}
class Goo extends Foo{
    //void show(){}//错误 final修饰的方法不能被重写
    void test(){}
}






//final修饰类
final class Hoo{}
//class Ioo extends Hoo{}//错误，final的类不能被继承
class Joo{}
final class Koo extends Joo{}//正确，final的类可以当子类
