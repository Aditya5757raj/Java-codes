import java.util.Scanner;
class NonNumeric
{
public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
	int sum=0;
	int a;
	int b;
	try
	{
	 a=s.nextInt();
	 b=s.nextInt();
	}
	
	catch(NumberFormatException e)
	{
	System.out.print("PLEASE Enter Integer Value");
	}
	sum=a+b;
System.out.print(sum);
}
}