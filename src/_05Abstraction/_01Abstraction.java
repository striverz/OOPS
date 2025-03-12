package _05Abstraction;

abstract class Animal{
    void eat(){
        System.out.println("The Animal eats food");
    }

    abstract void sound();
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("The Dogs sounds bow bow...");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("The Cat sounds meow meow...");
    }
}
public class _01Abstraction {
    public static void main(String[] args) {
        Animal a1=new Dog();
        a1.eat();
        a1.sound();

        System.out.println();

        Animal a2=new Cat();
        a2.eat();
        a2.sound();
    }
}
