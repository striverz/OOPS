package _06Interfaces;
interface A {
    default void show() {
        System.out.println("A's show");
    }
}

interface B {
    default void show() {
        System.out.println("B's show");
    }
}

class MyClass implements A, B {
    // Must override the conflicting method
    public void show() {
        System.out.println("Overriding show method");
    }
}



public class _03DefaultInMultipleInheritance {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
}
