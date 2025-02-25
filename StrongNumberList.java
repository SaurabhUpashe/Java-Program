// Find Strong Number List

import java.util.Scanner;
class StrongNumberList
{
	public static void main(String []args)
	{
		int []x = new int[10];

		Scanner sc = new Scanner(System.in);

		int i,sum,rem=0;
	
		System.out.println("Enter the "+x.length+" Array Element: ");
		for(i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}

		System.out.println("Strong Number List : ");
		for(i=0;i<x.length;i++)
		{
			int no=x[i];
			sum=0;
			
			while(no!=0)
			{
				rem=no%10;
				int fact=1;;
				for(int j=1;j<=rem;j++)
				{
					fact=fact*j;
				}
				sum=sum+fact;
				no=no/10;
			}
			if(x[i]==sum)
			{
				System.out.print("    "+x[i]);
			}
		}
	}
}