package s6;

import java.util.Scanner;

public class sample6 {
public static void main(String args[])
{
	
	
	Scanner in=new Scanner(System.in);
	char x=in.next().charAt(0);
	/*System.out.println("Enter the character " );*/
	if((x>=97)&&(x<=123))
	{
		System.out.println("Lowercase Letter ");
	}
	else if((x>=65)&&(x<=96))
	{
		System.out.println("Uppercase letter " );
	}
	else if((x>=48)&&(x<=57))
	{
		System.out.println("Digit " );
	}
	else
	{
		System.out.println("Special Symbol ");
	}
}
}
