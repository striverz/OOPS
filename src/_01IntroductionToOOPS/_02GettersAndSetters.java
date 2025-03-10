package _01IntroductionToOOPS;

class Rectangle1{

    //making the data fields private
    private int length;
    private int breadth;

    void setLength(int _length){
        if(_length<0) this.length=0;
        else this.length=_length;
    }
    void setBreadth(int _breadth){
        if(_breadth<0) this.breadth=0;
        else this.breadth=_breadth;
    }

    int getLength(){ return length; }
    int getBreadth(){ return breadth; }

    int area(){
        return length*breadth;
    }
    int perimeter(){
        return 2*(length+breadth);
    }

}
public class _02GettersAndSetters {
    public static void main(String[] args) {

        Rectangle1 r=new Rectangle1();
        r.setLength(-5);
        r.setBreadth(10);

        System.out.println("Area of Rectangle is : "+r.area());

    }
}
