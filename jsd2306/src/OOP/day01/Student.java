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

    public Student(String name, int i, String className, String stuId) {
    }

    //方法-----描述对象的行为
    void study(){
        System.out.println(this.name+"在学习...");
    }
    void sayHi(){
        System.out.println("大家好，我叫"+this.name+"，今年"+age+"岁了，所在班级为"+className+",学号为"+stuId);
    }
    void playWith(String anotherName){
        System.out.println(this.name+"正在和"+anotherName+"一起玩");
    }
    Student(){
        this("无名氏",1,"未知","未知");
    }
}
