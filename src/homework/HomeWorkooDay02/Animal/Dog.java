package homework.HomeWorkooDay02.Animal;

public class Dog extends Animal {

    Dog(String name, int age, String color, String type) {
        super(name, age, color, type);
    }

    void lookHome() {
        System.out.println(this.color + "色的" + this.age + "岁的" + type + this.name + "正在看家...");
    }
}
