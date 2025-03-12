package _05Abstraction;
//Abstraction is can also be achieved through the Interfaces
interface Animals{

    //By default, these are abstracted
    void eat();
    void sound();

}

class Dogs implements Animals{
    @Override
    public void eat(){
        System.out.println("The dogs eats food");
    }
    @Override
    public void sound(){
        System.out.println("The dogs makes sound");
    }
}

class Cats implements Animals{
    @Override
    public void eat(){
        System.out.println("The Cats eats food");
    }
    @Override
    public void sound(){
        System.out.println("The Cats makes sound");
    }
}
public class _02Interfaces {
    public static void main(String[] args) {

        Animals animal1=new Dogs();
        animal1.eat();
        animal1.sound();

        System.out.println();

        Animals animal2=new Cats();
        animal2.eat();
        animal2.sound();


    }
}
