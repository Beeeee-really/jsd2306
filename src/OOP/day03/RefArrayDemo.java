package OOP.day03;

public class RefArrayDemo {
    public static void main(String[] args) {
        //声明一个Dog型的数组dogs，包含3个元素，每个元素默认值为null，他们都是Dog型
        Dog[] dogs = new Dog[3];
        //声明Chick型数组chicks，包含3个元素，每个元素都是Chick型，默认值为null
        Chick[] chicks = new Chick[3];
        //声明Fish型数组fish，包含2个元素，每个元素都是Fish型，默认值为null
        Fish[] fish = new Fish[2];
        dogs[0] = new Dog("asa", 111, "qwq", "ererre");
        dogs[1] = new Dog("qwq",112,"w","12");
        dogs[2] = new Dog("qwq",112,"w","12");
        //输出第一只狗狗的名字
        System.out.println(dogs[0].name);
        dogs[0].lookHome();
        for (int i = 0; i < dogs.length; i += 1) {
            System.out.println(dogs[i].name);
            dogs[i].eat();
        }
    }
}



