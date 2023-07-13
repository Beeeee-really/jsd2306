package OOP.day02;

public class OverrideDemo {
    public static void main(String[] args) {
        Student zs = new Student("张三", 35, "佳木斯", "qwq", "sasas");
        zs.sayHi();

        Teacher ls = new Teacher("李四", 35, "吉姆斯", 600000);
        ls.sayHi();

        Doctor ww = new Doctor("王五", 35, "山东", "主任医师");
        ww.sayHi();//调用person中的方法
    }
}
