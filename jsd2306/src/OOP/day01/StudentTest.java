package OOP.day01;

public class StudentTest {
    public static void main(String[] args) {
        //引用类型变量 简称为引用 "="被称作指向 "new Student()"为对象
        Student zs = new Student();//声明了Student类型引用zs只向一个学生对象

        zs.stuId = "121";
        zs.className = "asa";
        zs.name = "张三";
        zs.age = 1;
    }
}
