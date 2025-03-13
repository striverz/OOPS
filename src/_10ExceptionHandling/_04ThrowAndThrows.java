package _10ExceptionHandling;


public class _04ThrowAndThrows {
    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            // Throwing an exception
            throw new Exception("Not eligible to vote.");
        }
        else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        int x=10;
        try{
            checkAge(x);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Program Continues...");


    }
}
