package _02Encapsulation;

class BankAccount{
    private String accountHolderName;
    private double balance;

    BankAccount(String accountHolderName,double balance){
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    public String getAccountHolderName(){
        return this.accountHolderName;
    }
    public double getBalance(){
        return balance;
    }
    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Withdraw is Successful ");
            System.out.println("Remaining Balance is : "+getBalance());
        }
        else{
            System.out.println("In-Sufficient Balance");
        }
    }

    public void deposit(double amount){
        if(amount<0){
            System.out.println("The amount should be Positive");
        }
        else{
            this.balance+=amount;
            System.out.println("Amount deposited Successfully. Total amount is " +getBalance());
        }
    }


}
public class _01Encapsulation {
    public static void main(String[] args) {
        BankAccount account=new BankAccount("Manikanta",1000);

        System.out.println(account.getBalance());
        account.deposit(200);
        System.out.println(account.getBalance());



    }
}
