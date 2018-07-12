package s8;

import java.util.Scanner;

public class sampl8 {
	public static void main(String args[])
	{
		int x=100;
		
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		 n=in.nextInt();
		if(n>x)
		{
			System.out.println("Guessed no is greater than the original no");
		}
		else if(n<x)
		{
			System.out.println("Guessed no is lesser than the original no");
		}
		else
		{
			System.out.println("Guessed no matches the original no");
		}
			
}

}
 


