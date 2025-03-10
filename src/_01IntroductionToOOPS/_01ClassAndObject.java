package _01IntroductionToOOPS;

class Rectangle{

    //Fields or Attributes
    public int length;
    public int breadth;

    //Behaviour or Methods
    int area(){
        return length*breadth;
    }

    int perimeter(){
        return 2*(length+breadth);
    }
}
public class _01ClassAndObject {
    public static void main(String[] args) {

        //Creating the Object for the class
        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=20;
        System.out.println("Area of Rectangle is : "+r.area());
        System.out.println("Perimeter of Rectangle is : "+r.perimeter());
    }
}
