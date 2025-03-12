package _08InnerClasses;

class OuterClass1{

    static int val=10;


    static class StaticNestedInnerClass{

        void display(){
            System.out.println("The Value is: "+val);
        }
    }
}
public class _01StaticNestedClass {
    public static void main(String[] args) {

       OuterClass1.StaticNestedInnerClass innerNestedObj=new OuterClass1.StaticNestedInnerClass();
       innerNestedObj.display();


    }

}
