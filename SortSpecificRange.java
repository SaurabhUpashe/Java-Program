// Sort specific Range

import java.util.Scanner;
class SortSpecificRange
{
	public static void main(String []args)
	{
		int []x = new int[10];
		
		Scanner sc = new Scanner(System.in);
			
		int i,j;
		System.out.println("Enter "+x.length+" array Element: ");
		for(i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
			
		}

		System.out.println("Array Element: ");
		for(i=0;i<10;i++)
		{
			System.out.print("  "+x[i]);
		}

		System.out.println("");
		System.out.println("Array Element size is:  "+x.length);
		System.out.println("Enter your Specific range where to whereform you want sort Array: ");
		int r1=sc.nextInt();
		int r2=sc.nextInt();

		for(i=r1;i<r2;i++)
		{
			for(j=i+1;j<=r2;j++)
			{
				if(x[i]>x[j])
				{
					int tmp=x[i];
					x[i]=x[j];
					x[j]=tmp;
				}
			}
		}

		System.out.println("");
		System.out.println("Sorted Specific Array Element: ");
		for(i=0;i<x.length;i++)
		{
			
			System.out.print("  "+x[i]);
		}


		
	}
}