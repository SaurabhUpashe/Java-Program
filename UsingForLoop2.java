 // WAP to display all Multiples of 3 and 5 nos from 1-100 no

import java.util.Scanner;
class UsingForLoop2
{
	public static void main(String []args)
	{
		int no=0,sum=0,i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Five no: ");
		for(i=0;i<5;i++)
		{
			no=sc.nextInt();
			sum=sum+no;
			
		}
		
		System.out.println("Addition is: "+sum);
	}
}