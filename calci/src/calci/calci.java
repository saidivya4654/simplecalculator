import java.util.Scanner;
import java.lang.Math;
public class Calculator {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	Calculator cal=new Calculator();
	System.out.print("Enter two numbers");
	final int a=s.nextInt();
	final int b=s.nextInt();
	double c=0;
	char s1=s.next().charAt(0);
	switch(s1)
	{
	case '+':c=(double)+(double)b;
	         break;
	case '-':c=(double)a-(double)b;
	         break;
	case '*':c=(double)a*(double)b;
	         break;
	case '/':c=(double)a/(double)b;
	         break;
	default:System.out.println("Enter the correct operator");
	
	}
	System.out.println(a+" "+s1+" "+b+" "+"="+" "+c);
}
}
