package s10;

import java.util.Scanner;

public class sample10 {
	public static void main(String args[]) {
		String str,rep;
		int n;
		Scanner ap=new Scanner(System.in);
		System.out.println("Enter the string");
		str =ap.nextLine();
		System.out.println(str);
		 System.out.println("enter a number");
	        n=ap.nextInt();
	        
	        
	        int x=str.length();
	        int y=x-n;
	        for(int i=0;i<x;i++)
	        {
	            System.out.print(str.charAt(i));
	            
	        }

	        for(int i=y;i<x;i++)
	        {
	            
	            for(int g=y;g<x;g++)
	            {
	                System.out.print(str.charAt(g));
	            }
	        }
	}

}
