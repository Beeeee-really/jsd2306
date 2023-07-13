package homework.HomeWork7.Animal;

public class Chick extends Animal {

    Chick(String name, int age, String color,String type) {
        super(name,age,color,type);
    }

    void layEggs() {
        System.out.println(color + "色的" + age + "岁的" + type + name + "正在下蛋...");
    }
}
