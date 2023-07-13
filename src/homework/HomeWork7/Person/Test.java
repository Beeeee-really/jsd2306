package homework.HomeWork7.Person;

public class Test {
    public static void main(String[] args) {
        Doctor zs = new Doctor("张三",30,"洛杉矶","主治医师");
        zs.cut();
        Student ls = new Student("李四",12,"洛杉矶","qwq","999666");
        ls.sayHi();
        ls.study();
        Teacher ww = new Teacher("王五",35,"重庆",99999);
        ww.sayHi();
        ww.teach();
    }
}
