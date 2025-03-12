package _08InnerClasses;
class OuterClass3{

    void OuterMethod(){

        class LocalInnerClass{
            int x=10; //This value is Effiectly final **Imp
            void InnerMethod(){
                System.out.println("The Local Inner Class" +x);
            }
        }

        LocalInnerClass lic=new LocalInnerClass();
        lic.InnerMethod();
    }

}
public class _03LocalInnerClass {
    public static void main(String[] args) {
        OuterClass3 outer=new OuterClass3();
        outer.OuterMethod();

    }
}
