package _07StaticKeyword;
class BankAccount{

    //Static variable
    public static int counter=0;

    String name;
    int amount;

    BankAccount(String name,int amount){
        this.name=name;
        this.amount=amount;
        ++counter;
    }



}
public class _01StaticVariable {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount("Manikanta",1000);
        BankAccount b2=new BankAccount("Panee",500);

        System.out.println("The number of bankaccounts created : "+BankAccount.counter); //Static variable of the Class



    }
}
