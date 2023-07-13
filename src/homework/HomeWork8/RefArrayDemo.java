package homework.HomeWork8;

public class RefArrayDemo {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[2];
        Chick[] chicks = new Chick[2];
        Fish[] fish = new Fish[3];
        dogs[0] = new Dog("qwq", 33, "紫");
        dogs[1] = new Dog("qwq", 33, "紫");
        chicks[0] = new Chick("qwq", 33, "紫");
        chicks[1] = new Chick("qwq", 33, "紫");
        fish[0] = new Fish("qwq", 444, "lll");
        fish[1] = new Fish("qwq", 444, "lll");
        fish[2] = new Fish("qwq", 444, "lll");

        for (int i = 0; i < dogs.length; i += 1) {
            System.out.println(dogs[i].name);
        }
        for (int i = 0; i < chicks.length; i += 1) {
            System.out.println(chicks[i].name);
        }
        for (int i = 0; i < fish.length; i += 1) {
            System.out.println(fish[i].name);
        }
    }
}
