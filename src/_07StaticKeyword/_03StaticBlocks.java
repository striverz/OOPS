package _07StaticKeyword;

class Example{

    static{
        System.out.println("static block1");

    }

    static{
        System.out.println("static block2");
    }

    static{
        System.out.println("static block3");
    }


}
public class _03StaticBlocks {
    public static void main(String[] args) {
        Example e=new Example();

    }
}
