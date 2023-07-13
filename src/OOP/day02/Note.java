package OOP.day02;


import com.sun.org.apache.xpath.internal.operations.String;

public class Note {
    /**
     * 生活中的继承：
     * (1)继承财产
     * 钱不用自己挣，自己也能花
     * (2)继承皇位
     * (3)继承工作
     * class student{
     * String name;
     * }
     * class teacher{
     * String name;
     * }
     * class doctor{
     * Stirng name;
     * }
     * 重复
     * 继承：extends
     */

    class Person { //父类
        String name;
        int age;
        String address;

        void eat() {
        }

        void sleep() {
        }
    }

    Person p = new Person();//父类不能访问子类  子类可以访问父类


    class Student extends Person {//派生类/子类
        String stuId;

        void study() {
        }
    }


    class Doctor extends Person {//派生类/子类
        String lavel;

        void cut() {
        }
    }


    class Teacher extends Person {//派生类/子类
        String Salary;

        void teach() {
        }
    }


    class Aoo {//a
        int a;
    }

    class Boo extends Aoo {//b+a
        int b;
    }

    class Coo extends Boo {// c+b+a
        int c;
    }
}
