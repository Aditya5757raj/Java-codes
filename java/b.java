import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } 
		catch (ArithmeticException e) 
		{
            System.out.println("Error: Division by zero is not allowed.");
        } 
		
         catch (Exception e) 
		 {
            System.out.println("Default exception: " + e.getMessage());
         } 
		finally 
		{
            scanner.close();
        }
    }
}
