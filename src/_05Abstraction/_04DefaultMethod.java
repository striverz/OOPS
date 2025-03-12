package _05Abstraction;
interface Example{
    default void defaultMethod(){
        System.out.println("The Default method in Interface");
    }
}
class Demo implements Example{
    //for accessing the default method we use this
}
public class _04DefaultMethod {
    public static void main(String[] args) {

        Example e=new Demo();
        e.defaultMethod();

    }
}
