package _03Inheritance;

class Teacher{

    void Demo(){
        System.out.println("The Teacher Demo");
    }
}

class Student1 extends Teacher{
    @Override
   void Demo(){
       System.out.println("The Student1 Demo");
   }
}
//Hirarical Inheritance
class Student2 extends Teacher{
    @Override
    void Demo(){
        System.out.println("The Student2 Demo");
    }
}
public class _02Overriding {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.Demo();

        Student1 s1=new Student1();
        s1.Demo();

        Student2 s2=new Student2();
        s2.Demo();

    }
}
