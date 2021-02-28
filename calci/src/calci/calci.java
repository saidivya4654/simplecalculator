import java.util.Scanner;
public class Calculator {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.print("Enter two numbers");
	double a=s.nextDouble();
	double b=s.nextDouble();
	double c=0;
	char s1=s.next().charAt(0);
	switch(s1)
	{
	case '+':c=a+b;
	         break;
	case '-':c=a-b;
	         break;
	case '*':c=a*b;
	         break;
	case '/':c=a/b;
	         break;
	default:System.out.println("Enter the correct operator");
	
	}
	System.out.println(a+" "+s1+" "+b+" "+"="+" "+c);
}
}
