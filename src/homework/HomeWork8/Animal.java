package homework.HomeWork8;

public abstract class Animal {
    String name;
    int age;
    String color;

    Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    void drink(){
        System.out.println(name+"正在喝水...");
    }

    abstract void eat();


}

