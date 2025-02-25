// using InsertionSort

import java.io.*;
class InsertionSort
{
	public static void main(String []args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int []x = new int[5];
		int i;
		System.out.println("Enter "+x.length+" Array: ");
		for(i=0;i<x.length;i++)
		{
			x[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Orignal Array: ");
		for(i=0;i<x.length;i++)
		{		
			System.out.print("   "+x[i]);
		}

		int tmp;
		for(i=1;i<x.length;i++)
		{
			tmp=x[i];
			int j=i-1;

			while(j>=0 && x[j]>tmp)
			{
				x[j+1]=x[j];
				j--;
			}
			x[j+1]=tmp;
		}

		System.out.println("");
		System.out.println("Sort Array: ");
		for(i=0;i<x.length;i++)
		{		
			System.out.print("   "+x[i]);
		}

	}
}
