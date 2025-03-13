package _10ExceptionHandling;
class CustomException extends Exception{
    CustomException(String message){
        super(message);
    }
}

public class _05CustomException {
    public static void main(String[] args) {
        try {
            // throwing custom made exception
            throw new CustomException("This is a custom exception!");
        }
        catch (CustomException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
