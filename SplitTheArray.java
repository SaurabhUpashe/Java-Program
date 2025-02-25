// Split Negative element One Side

import java.util.Scanner;
class SplitTheArray
{
	public static void main(String []args)
	{
		int []x = new int[10];

		Scanner sc = new Scanner(System.in);
	
		int i,j;
		System.out.println("Enter the "+x.length+" Array Element: ");
		for(i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}

		System.out.println("Array Element: ");
		for(i=0;i<x.length;i++)
		{
			System.out.print("   "+x[i]);
		}
		for(i=0;i<10;i++)
		{
			for(j=0;j<10;j++)
			{
				if(x[i]<x[j])
				{
					int tmp=x[i];
					x[i]=x[j];
					x[j]=tmp;
				}	
			}
		}

		System.out.println("");
		System.out.println("Negative Array Element One Side: ");
		for(i=0;i<x.length;i++)
		{
			System.out.print("   "+x[i]);
		}
	}
}