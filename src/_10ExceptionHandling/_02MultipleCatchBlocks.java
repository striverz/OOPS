package _10ExceptionHandling;

public class _02MultipleCatchBlocks {
    public static void main(String[] args) {
        // Try-Catch Block for Exception Handling
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException
        }
        // Catch block to handle ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        }
        // Catch block to handle ArithmeticException
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        // Remaining code
        System.out.println("Program continues...");
    }
}
