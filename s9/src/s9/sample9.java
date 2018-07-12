package s9;
import java.util.Scanner;
public class sample9 {
public static void main(String args[]) {
	String str;
	String rstr;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the string");
	str=in.nextLine();
	rstr=in.nextLine();

	int l=str.length();
	for(int i=l-1;i>=0;i--)
	{
		rstr=rstr+str.charAt(i);
	}
	System.out.println("Revis   "+rstr);
}
}
