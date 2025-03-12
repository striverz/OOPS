package _07StaticKeyword;

//Math.sqrt(1,2) Example method
class Calculator{
    static int add(int a,int b){
        return a+b;
    }
    static int mul(int a,int b){
        return a*b;
    }
}

public class _02StaticMethod {
    public static void main(String[] args) {

        System.out.println(Calculator.add(1,2));
        System.out.println(Calculator.mul(2,3));



    }
}
