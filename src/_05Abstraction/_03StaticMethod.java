package _05Abstraction;
class StaticExample{

    static int priceOfHonda=1000;

    static{
        System.out.println("The Static block1");
    }
    static {
        System.out.println("The Static block2");
    }


    static void method(){
        System.out.println("The static method in Java");
    }

    static{
        System.out.println("The Static block3");
    }

}
public class _03StaticMethod {
    public static void main(String[] args) {

        System.out.println(StaticExample.priceOfHonda);
        StaticExample.method();


    }
}
