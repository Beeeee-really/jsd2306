package OOP.day04;

public class Chick extends Animal {
    void eat(){

    }

    Chick(String name, int age, String color,String type) {
        super(name,age,color,type);
    }

    void layEggs() {
        System.out.println(color + "色的" + age + "岁的" + type + name + "正在下蛋...");
    }
}
