public class Largest {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 4;
        int num3 = 5;
        int largest = num1;
        
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        
        System.out.println("The Largest number is: " + largest);
    }
}

class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        int c;
        for (int i = 1; i <= 10; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}