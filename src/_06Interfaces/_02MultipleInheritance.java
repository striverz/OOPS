package _06Interfaces;
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}
public class _02MultipleInheritance {
    public static void main(String[] args) {
        Duck d=new Duck();
        d.fly();
        d.swim();
    }
}
