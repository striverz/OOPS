package _08InnerClasses;
interface Sample1{
    public void method1();
}

abstract class Sample2{
    abstract public void method2();

}
public class _04AnonymousInnerClass {
    public static void main(String[] args) {

        Sample1 s1=new Sample1() {
            @Override
            public void method1(){
                System.out.println("Anonymous Class1");
            }
        };
        s1.method1();


        Sample2 s2=new Sample2() {
            @Override
            public void method2() {
                System.out.println("Anonymous Class2");
            }
        };
        s2.method2();
    }
}
