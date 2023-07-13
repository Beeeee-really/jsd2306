package OOP.day01;

public class Try {
    public static class Student {
        String name;
        int age;
        String className;
        String stuId;

        public Student(String name, int age, String className, String stuId) {

        }


        void awa() {
            System.out.println("qwq");
        }

        void qwq() {
            System.out.println("awa");
        }
    }


    public static void main(String[] args) {
        Student qwq = new Student("qwq", 2, "qwq", "qwq");
        qwq.awa();
        qwq.awa();
        qwq.qwq();
    }
}
