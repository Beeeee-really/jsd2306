package ooday01;
/** 学生类 */
public class Student {
    //成员变量---描述对象的属性
    String name;
    int age;
    String className;
    String stuId;
    //构造方法
    Student(){
        this("无名氏",1,"未知","未知"); //调用4个参数构造
    }
    Student(String name,int age,String className,String stuId){
        this.name = name;
        this.age = age;
        this.className = className;
        this.stuId = stuId;
    }

    //方法------描述对象的行为
    void study(){
        System.out.println(name+"在学习...");
        sayHi();
    }
    void sayHi(){
        System.out.println("大家好，我叫"+name+"，今年"+age+
                 "岁了，所在班级为"+className+"，学号为:"+stuId);
    }
    void playWith(String anotherName){
        System.out.println(name+"正在和"+anotherName+"一起玩...");
    }
}


















