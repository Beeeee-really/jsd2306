package OOP.day02;

public class Student extends Person {
    String className;
    String stuId;

    void sayHi() {
        System.out.println("qwq" + className + name + address + stuId + age);
    }

    Student() {
        super();
    }

    Student(String name, int age, String address, String className, String stuId) {
        super();
        this.className = className;
        this.stuId = stuId;
    }

    void study() {
        System.out.println(name + "正在学习...");
    }
}


































































































































































