package _08InnerClasses;
class OuterClass2 {
    int instanceVar = 42;

    // Non-static Nested Inner class
    class NonStaticInnerClass {
        void display() {
            System.out.println("Instance variable: " + instanceVar);
        }
    }
}
public class _02NonStaticNestedClass {
    public static void main(String[] args) {
        OuterClass2.NonStaticInnerClass innerNonStatic=new OuterClass2().new NonStaticInnerClass();
        innerNonStatic.display();
    }
}
