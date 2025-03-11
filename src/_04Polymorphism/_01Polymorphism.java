package _04Polymorphism;
class Calculator{
    int add(int a,int b){
        return a+b;
    }

    double add(double a,double b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
}

class Parent{
    void Display(){
        System.out.println("Parent Display");
    }
}

class Child extends Parent{
    @Override
    void Display(){
        System.out.println("Child Display");
    }
}
public class _01Polymorphism {
    public static void main(String[] args) {

        Calculator c=new Calculator();
        c.add(2,3); //5


        Child cc=new Child();
        cc.Display();

        //Dynamic Method Dispatching(Runtime Polymorphism is achieven)
        //Super Class Reference Child class Object
        Parent p=new Child();
        p.Display();





    }
}
