package OOP.day02;

public class Teacher extends Person {
    int salary;

    Teacher(String name, int age, String address, int saslary) {
        super(name, age, address);
        saslary = 100000;
    }

    void teach() {
        System.out.println(name + "正在讲课...");
    }

    void sayHi() {
        System.out.println("qwq" + name + address + age+ salary);
    }



}
