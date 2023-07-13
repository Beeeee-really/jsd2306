package OOP.day04;

public class Master {
    static void feed(Dog dog) {//喂狗
        dog.eat();
    }

    void feed(Chick chick) {//喂鸡
        chick.eat();
    }

    void feed(Fish fish) {//喂鱼
        fish.eat();
    }

    void feed(Animal animal) {
        animal.eat();
    } 

    public static void main(String[] args) {
        Master master = new Master();

        Dog dog = new Dog("qwq", 1, "sas", "11");
        Master.feed(dog);
        //强转
        Animal o = new Dog("212",121,"1212","1212");
        //Fish f = (fish)o;//错误

        System.out.println(o instanceof Dog);
        System.out.println(o instanceof Swim);
        System.out.println(o instanceof Fish);//为true则强转一定成功





    }
}
