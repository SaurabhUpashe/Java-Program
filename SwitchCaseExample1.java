 // WAP to perform the add,sub, multi, div according to  the users choice

import java.util.*;
class SwitchCaseExample1
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****Menu******");
		System.out.println("1.Add \t 2.Multi \t 3.Div \t Sub");
		System.out.println("Enter your Option");
		int opt=sc.nextInt();

		System.out.println("Enter Any Two Number: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();

		int ans;
		switch(opt)
		{
			case 1:
				ans=n1+n2;
				System.out.println("Answer is: "+ans);
			break;
			case 2:
				ans=n1*n2;
				System.out.println("Answer is: "+ans);
			break;
			case 3:
				ans=n1/n2;
				System.out.println("Answer is: "+ans);
			break;
			case 4:
				ans=n1-n2;
				System.out.println("Answer is: "+ans);
			break;
			default:
				System.out.println("Choose correct option");
		}
		
	}
}