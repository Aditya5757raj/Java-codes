import java.util.Scanner;
//code by Aditya
public class inputNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first digit (0-9): ");
        int digit1 = scanner.nextInt();

        System.out.print("Enter the second digit (0-9): ");
        int digit2 = scanner.nextInt();

        System.out.print("Enter the third digit (0-9): ");
        int digit3 = scanner.nextInt();

        System.out.println("All possible combinations:");
        System.out.println(digit1 + "" + digit2 + "" + digit3);
        System.out.println(digit1 + "" + digit3 + "" + digit2);
        System.out.println(digit2 + "" + digit1 + "" + digit3);
        System.out.println(digit2 + "" + digit3 + "" + digit1);
        System.out.println(digit3 + "" + digit1 + "" + digit2);
        System.out.println(digit3 + "" + digit2 + "" + digit1);
    }
}
class Sum {
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 40; i < 250; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }  
        System.out.print(sum);
    }
}

