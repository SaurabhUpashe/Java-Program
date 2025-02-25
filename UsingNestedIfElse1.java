

import java.util.Scanner;
class UsingNestedIfElse1
{
	public static void main(String []args)
	{
		char ch='a';
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any charcter: ");
		ch=sc.nextLine().charAt(0);

				
		if(ch>=65&&ch<=90)
		{
			System.out.println("Charcter is Uppercase: ");
		}			
		else
		{
			if(ch>=97 && ch<=122)
			{
				System.out.println("Charcter is Lowercase: ");
			}
			else
			{
				System.out.println("Charcter is SpecialSymbol: ");
			}
		}

		
	}
}