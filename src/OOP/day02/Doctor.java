package OOP.day02;

public class Doctor extends Person {
    String title;

    Doctor() {
    }

    Doctor(String name, int age, String address, String title) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.title = title;
    }

    void cut() {
        System.out.println(name + "正在做手术...");
    }
}

