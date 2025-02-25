 // using the switch case within infinite loop (using exit)

import java.util.*;
class SwitchCaseExample2
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		double n1,n2;
		int opt;
		
		while(true)
		{
			
			System.out.println("*****Menu******");
			System.out.println("1.Add \t 2.Multi \t 3.Div \t 4.Sub \t 5.stop");
			System.out.println("Enter your Option");
		 	opt=sc.nextInt();

			System.out.println("Enter Any Two Number: ");
			n1=sc.nextInt();
			n2=sc.nextInt();

			Double ans=0.0;
			switch(opt)
			{
				case 1:
					ans=n1+n2;
					break;
				case 2:
					ans=n1*n2;
					break;
				case 3:
					ans=n1/n2;
					break;
				case 4:
					ans=n1-n2;
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Choose correct option");
			
				
			}
			System.out.println("Answer is: "+ans);
		}
		
		
	}
}