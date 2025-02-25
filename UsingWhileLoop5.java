// WAP to generate the max number using the digits of entered number

import java.util.*;
class UsingWhileLoop5
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter any No: ");
		int no=sc.nextInt();
		
		int tmp=no;
		int nn=0,rem=0;
		int dg=9;
		while(dg>=0)
		{
			no=tmp;
			while(no!=0)
			{
				rem=no%10;
				if(rem==dg)
				{
					nn=nn*10+rem;
				}
				no=no/10;
			}	
			dg--;
		}
		System.out.println("Max Number is: "+nn);
	}
}