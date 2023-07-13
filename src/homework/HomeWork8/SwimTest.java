package homework.HomeWork8;

public class SwimTest {
    public static void main(String[] args) {
        Dog dog = new Dog("qwq",121,"黑");
        Chick chick = new Chick("awa",1313,"红");
        Fish fish = new Fish("qwqw",414,"绿");
        dog.swim();
        dog.drink();
        dog.eat();
        dog.lookHome();
        chick.layEggs();
        chick.eat();
        chick.drink();
        fish.swim();
        fish.drink();
        fish.eat();
    }
}
