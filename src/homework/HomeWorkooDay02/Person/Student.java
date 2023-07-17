package homework.HomeWorkooDay02.Person;

public class Student extends Person {
    String className;
    String stuId;

    Student(String name, int age, String address, String className, String stuId) {
        super(name, age, address);
        this.className = className;
        this.stuId = stuId;
    }

    void study() {
        System.out.println(name + "正在学习...");
    }

    void sayHi() {
        System.out.println("我是" + name + "，今年" + age + "岁了，住在" + address + "学号是" + stuId);
    }
}
