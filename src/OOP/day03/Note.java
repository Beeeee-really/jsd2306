package OOP.day03;

/**
 * 设计规则：
 * ---将派生类所共有的属性和行为，抽到超类中------------------------------------抽共性
 * ---若派生类的行为代码都一样，设计为普通方法
 *    若派生类的行为代码不一样，设计为抽象方法
 * 抽象类：
 * 1.包含抽象方法的类需为抽象类 不包含抽象方法的类也可以声名为抽象类，只要抽象类不被实例化(new)
 * 2.由abstract修饰
 * 3.抽象类不能被实例化(new)
 * 4.抽象类是需要被继承的，派生类有两种处理方法
 *   1)也声明为抽象类----------------------很少这么做
 *   2)必须重写所有抽象方法-----------------变不完整为完整(常见做法)
 * 5.抽象类的意义：
 *   1)封装共有的属性和行为
 *   2)可以包含抽象方法，为所有派生类统一入口(名字统一)，强制重写
 * 6.abstract final相反，不能一起用
 * 接口：
 * 1.是一种引用数据类型
 * 2.由interface定义
 * 3.只能包含抽象方法(常量、静态方法、)
 */
abstract class Note {
    String name;
    int age;
    String color;
    void drink(){
        System.out.println("hello world!");
    }

    abstract void eat();
}

 class Dog_2 extends Note{
    void eat (){
        System.out.println("hello world!");//重写抽象方法
    }
}
abstract class Chick_2 extends Note{
}
abstract class Qwq{
    int a;
}
//abstract final class awa{
//    int a;
//}
