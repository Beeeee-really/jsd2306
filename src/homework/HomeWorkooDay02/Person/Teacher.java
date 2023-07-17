package homework.HomeWorkooDay02.Person;

public class Teacher extends Person {
    int salary;

    Teacher(String name, int age, String address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }

    void teach() {
        System.out.println(name + "正在上课");
    }

    void sayHi() {
        System.out.println("我是" + name + "，今年" + age + "岁了，住在" + address + "工资：" + salary + "元");
    }
}
