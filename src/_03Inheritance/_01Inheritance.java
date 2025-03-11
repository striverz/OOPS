package _03Inheritance;

class Phone{
    private String brand;
    private double price;

    Phone(String brand,double price){
        this.brand=brand;
        this.price=price;
    }

    void DisplayPhone(){
        System.out.println("Phone brand is : "+brand);
        System.out.println("Phone price is : "+price);

    }
}

//Single Inheritance
class SmartPhone extends Phone{
    private int storage;
    private int ram;
   SmartPhone(String brand,double price,int storage,int ram){
       super(brand,price);
       this.storage=storage;
       this.ram=ram;

   }
   void DisplaySmartPhone(){
       super.DisplayPhone();
       System.out.println("SmartPhone storage is : "+storage);
       System.out.println("SmartPhone storage is : "+ram);
   }

}
//Multilevel Inheritance
class FeaturedPhone extends SmartPhone{

    private int bateryCapacity;
    FeaturedPhone(String brand,double price, int storage,int ram,int bateryCapacity){
        super(brand,price,storage,ram);
        this.bateryCapacity=bateryCapacity;
    }
    void DisplayFeaturedPhone(){
        super.DisplaySmartPhone();
        System.out.println("Featured Phone batery is : "+bateryCapacity);
    }

}
public class _01Inheritance {
    public static void main(String[] args) {

        Phone p=new Phone("Nokia",1000);
        p.DisplayPhone();
        System.out.println();

        SmartPhone s=new SmartPhone("Realme",10000,128,6);
        s.DisplaySmartPhone();
        System.out.println();

        FeaturedPhone f=new FeaturedPhone("Apple",100000,256,8,5000);
        f.DisplayFeaturedPhone();


    }
}
