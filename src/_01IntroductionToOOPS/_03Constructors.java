package _01IntroductionToOOPS;

class Person{
    String name;
    int age;

    //Default Constructor
    Person(){
        this.name="Manikanta";
        this.age=21;
    }

    //Parameter Constructor
    Person(String _name,int _age){
        this.name=_name;
        this.age=_age;
    }

    //Copy Constructor
    Person(Person p){
        this.name=p.name;
        this.age=p.age;
    }

    void Display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println();
    }
}
public class _03Constructors {
    public static void main(String[] args) {

        //Default Constructor calling
        Person p1=new Person();
        p1.Display();

        //Parameter Constructor calling
        Person p2=new Person("Mahesh",45);
        p2.Display();

        //Copy Constructor
        Person p3=new Person(p2);
        p3.Display();

    }
}
