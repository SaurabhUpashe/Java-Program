 // WAP TO DISPLAY THE ENTERED NUMBER IS PRIME OR NOT

import java.util.Scanner;
class DoWhileLoop1
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int no,flg=0,i;
		System.out.println("Enter any No: ");
		no=sc.nextInt();
		
		i=2;
		do
		{
			if(no%i==0)
			{
				flg=1;
				break;
			}
			i++;
		}while(i<=no/2);

		if(flg==0)
		{
			System.out.println("No is prime");
		}
		else
			System.out.println("No is not prime ");
	}
}