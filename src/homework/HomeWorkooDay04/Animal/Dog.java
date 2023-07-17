package homework.HomeWorkooDay04.Animal;

public class Dog extends Animal implements Swim {
    Dog (String name,int age,String color){
        super(name,age,color);
    }

    public void eat() {

    }

    public void swim() {
        System.out.println("qwq");
    }


    void lookHome(){

    }
}
