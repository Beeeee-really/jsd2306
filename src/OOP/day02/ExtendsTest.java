package OOP.day02;

public class ExtendsTest {
    public static void main(String[] args) {
        Student zs = new Student();
        zs.name = "张三";
        zs.age = 25;
        zs.address = "廊坊";
        zs.className = "jsd2306";
        zs.stuId = "1121";

        zs.eat();


        zs.study();
        zs.sayHi();
        zs.sleep();
    }
}
