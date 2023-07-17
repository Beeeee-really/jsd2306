package homework.HomeWorkooDay02.Animal;

public class Animal {
    String type;
    String name;
    int age;
    String color;

    public Animal(String name, int age, String color, String type) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void eat() {
        System.out.println(color + "色的" + age + "岁的" + type + name + "正在吃饭...");
    }

    void drink() {
        System.out.println(color + "色的" + age + "岁的" + type + name + "正在喝水哦...");
    }
}
