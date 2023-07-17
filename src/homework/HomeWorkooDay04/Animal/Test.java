package homework.HomeWorkooDay04.Animal;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Chick("qwq", 121, "awa");
        animals[1] = new Dog("qwq", 131, "awa");
        animals[2] = new Fish("awa", 1313, "wew");
        for (int i = 0; i < animals.length; i += 1) {
            System.out.println(animals[i].name);
            animals[i].eat();
            animals[i].drink();
        }


        Master qwq = new Master();
        qwq.feed();
    }
}
