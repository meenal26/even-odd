package largest;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		int a,b,c,largest;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the three numbers");
		 a=s.nextInt();
	     b=s.nextInt();
		 c=s.nextInt();
		if(a>=b && a>=c)
		{
		System.out.println("largest number"+a);
		}
		if(b>=a && b>=c)
		{
		System.out.println("largest number"+b);
		}
		if(c>=a && c>=b)
		{
		System.out.println("largest number"+c);
		}
	}
}
	
