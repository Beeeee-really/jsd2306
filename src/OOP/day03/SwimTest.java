package OOP.day03;

public class SwimTest {
    public static void main(String[] args) {
        Dog dage = new Dog("qwq", 1212, "彩虹", "awa");
        dage.swim();
        dage.eat();
        dage.lookHome();
        Fish fish = new Fish("小红", 12121212, "五彩斑斓", "鱼");
        fish.swim();
        fish.eat();
        fish.drink();
        Chick chick = new Chick("qwq", 121212, "qwq", "awaw");
        chick.eat();
        chick.layEggs();
        chick.drink();
    }
}
