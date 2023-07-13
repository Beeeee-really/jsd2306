package OOP.day02;

public class Dog extends Animal {

    public Dog(String name, int age, String color, String type) {
        super(name, age, color, type);
    }

    public void lookHome() {
        System.out.println(this.color + "色的" + this.age + "岁的" + type + this.name + "正在看家...");
    }
}
