package s3;
import java.util.Scanner;
public class sample3 {
	public static void main(String args[]) {
		String str;
		char ch;
		int i=0;
	
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string/character");
	
		
			
				
				str=in.nextLine();
				{
					try {
						Integer.parseInt(str);
						System.out.println("invalid");
					}
					catch(NumberFormatException e) {
						for(i=0;i<str.length();i++)
						{
							ch=str.charAt(i);
			
if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
{
  
	
  
	{
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
		System.out.println(ch+ " the given letter is a vowel");
	}
	else
	{
		System.out.println(ch+ "The given letter is a consonent");
	}
}
}
else
	System.out.println(ch+ "Error....... not a letter");

	
}
}
}
	}
}
	