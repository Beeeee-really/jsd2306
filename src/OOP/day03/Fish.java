package OOP.day03;

public class Fish extends Animal implements Swim{

    public void swim() {
        System.out.println(color+"色的"+age+"岁的小鱼"+name+"正在游泳...");
    }

    void eat() {

    }

    public Fish(String name, int age, String color, String type) {
        super(name, age, color, type);
    }
}
