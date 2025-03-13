package _10ExceptionHandling;
class InsufficientBalanceException extends Exception{

    InsufficientBalanceException(String name){
        super(name);
    }
}
class BankAccount{
    String name;
    double balance;

    BankAccount(String name,double balance){
        this.name=name;
        this.balance=balance;
    }

    double getBalance(){
        return balance;
    }

    void addBalance(double amount){
        balance+=amount;
        System.out.println("Balance Added "+balance);
    }

    void withDrawBalance(double amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance: "+balance);
        }
        else{
            balance-=amount;
            System.out.println("Balance Withdram successful");
        }
    }
}
public class _06Example {
    public static void main(String[] args) {
        BankAccount acc1=new BankAccount("Mani",1000);


        try{
            acc1.withDrawBalance(2000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
