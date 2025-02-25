// WAP to generate the two max numbers using the even and odd digits of number entered thw keyboard

import java.util.Scanner;
class DoWhileLoop3
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int no=0,even_no=0,odd_no=0,rem=0;
		System.out.println("Enter any number: ");
		no=sc.nextInt();
		
		int tmp=no;
		int dg=9;
		do
		{

		        no=tmp;
			do
			{
				rem=no%10;
				if(rem==dg)
				{
					if(rem%2==0)
					{
						even_no=even_no*10+rem;
					}
					else
					{
						odd_no=odd_no*10+rem;
					}
				}

				no=no/10;
			}while(no!=0);


			

			dg--;
		}while(dg>=0);
		
		System.out.println("Even max is: "+even_no);
		System.out.println("odd max is: "+odd_no);
		
	}
}