package OOP.day02;

public class AnimalTest {
    public static void main(String[] args) {
        Dog zs = new Dog("小明", 12, "黑", "普通小狗");
        zs.eat();
        zs.lookHome();
        zs.drink();
        Chick awa = new Chick("小红", 99999, "紫", "变异小鸡");
        awa.eat();
        awa.drink();
        awa.layEggs();
        Fish qwq = new Fish("小王", 999999999, "彩虹", "彩虹鱼");
        qwq.drink();
        qwq.eat();
    }
}
