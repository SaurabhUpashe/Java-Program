 // Enter the no and just add all digits in it.

import java.util.Scanner;
class UsingForLoop3
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int no=0,ans=0;

		System.out.println("Enter Any No: ");
		no=sc.nextInt();

		for(;no!=0;)
		{
			ans=ans+(no%10);
			no=no/10;
		}

		System.out.println("Digit Addition is: "+ans);
	}
}