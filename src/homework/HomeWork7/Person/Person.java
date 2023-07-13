package homework.HomeWork7.Person;

public class Person {
    String name;
    int age;
    String address;

    Person(){}

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void eat() {
        System.out.println(name + "正在吃饭...");
    }

    void sleep() {
        System.out.println(name + "正在睡觉...");
    }

    void sayHi() {
        System.out.println("我是" + name + "，今年" + age + "岁了，住在" + address);
    }
}
