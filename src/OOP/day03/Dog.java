package OOP.day03;

public class Dog extends Animal implements Swim {
    public void swim(){
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在游泳...");
    }

    void eat() {
        System.out.println("hello world!");
    }

    public Dog(String name, int age, String color, String type) {
        super(name, age, color, type);
    }


    public void lookHome() {
        System.out.println(this.color + "色的" + this.age + "岁的" + type + this.name + "正在看家...");
    }
}
