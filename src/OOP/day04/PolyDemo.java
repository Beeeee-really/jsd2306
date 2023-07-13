package OOP.day04;

public class PolyDemo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog("qwq", 2, "qeqw", "qwqqwq");
        animals[1] = new Dog("qwq", 2, "qeqw", "qwqqwq");
        animals[2] = new Fish("qwq", 2, "qeqw", "qwqqwq");
        animals[3] = new Fish("qoq", 9992, "qeqw", "qwq");
        animals[4] = new Fish("qwq", 2, "qeqw", "qwq");
        for (int i = 0; i < animals.length; i += 1) {
            System.out.println(animals[i].name);
            animals[i].eat();
            animals[i].drink();
        }

        int i = 0;
        if (animals[i] instanceof Dog) {
            Dog dog = (Dog) animals[i];
            dog.lookHome();
            dog.swim();
        }
        if (animals[i] instanceof Fish) {
            Fish fish = (Fish) animals[i];
            fish.eat();
            fish.swim();
        }

    }
}
