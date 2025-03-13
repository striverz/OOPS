package _10ExceptionHandling;

public class _03FinallyBlock {
    public static void main(String[] args) {
        // Try-catch ladder
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        }
        catch (Exception e) {
            System.out.println("An error occurred.");
        }
        // finally block
        finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");

    }
}
