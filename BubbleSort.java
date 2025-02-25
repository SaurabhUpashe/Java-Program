// Using BubbleSort

import java.util.*;
class BubbleSort
{
	public static void main(String []args)throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int []x = new int[5];
		int i;
		System.out.println("Enter "+x.length+" Array: ");
		for(i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}

		System.out.println("Orignal Array: ");
		for(i=0;i<x.length;i++)
		{		
			System.out.print("   "+x[i]);
		}

		for(i=0;i<x.length-1;i++)
		{
			for(int j=0;j<x.length-1;j++)
			{
				if(x[j]>x[j+1])
				{
					int tmp=x[j];
					x[j]=x[j+1];
					x[j+1]=tmp;
				}
			}
		}

		System.out.println("");
		System.out.println("Sort Array: ");
		for(i=0;i<x.length;i++)
		{		
			System.out.print("   "+x[i]);
		}

	}
}
