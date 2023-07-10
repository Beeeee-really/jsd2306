package OOP.day01;

/**
 * 学生类
 */
public class Student {
    //成员变量--描述对象的属性
    String name;
    int age;
    String className;
    String stuId;

    //方法-----描述对象的行为
    void study(){
        System.out.println(name+"在学习...");
    }
    void sayHi(){
        System.out.println("大家好，我叫"+name+"，今年"+age+"岁了，所在班级为"+className+",学号为"+stuId);
    }
    void playWith(String anotherName){
        System.out.println(name+"正在和"+anotherName+"一起玩");
    }
}
