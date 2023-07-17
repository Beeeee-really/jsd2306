package homework.HomeWorkooDay02.Person;

public class Doctor extends Person{
    String title;
    Doctor (String name, int age, String address, String title){
        super(name,age,address);
        this.title=title;
    }

    void cut(){
        System.out.println(name+title+"正在做手术...");
    }
}
